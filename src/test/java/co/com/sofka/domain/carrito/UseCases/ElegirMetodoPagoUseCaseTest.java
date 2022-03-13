package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.ElegirMetodoPago;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.MetodoPagoElegido;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class ElegirMetodoPagoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void elegirMetodoPago(){
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        MetodoPago metodoPago = new MetodoPago(MetodoPago.Pago.EFECTIVO);

        var command = new ElegirMetodoPago(carritoID, metodoPago);
        var usecase = new ElegirMetodoPagoUseCase();

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carritoID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (MetodoPagoElegido) events.get(0);

        Assertions.assertEquals("sofka.carrito.MetodoPagoElegido", event.type);
        Assertions.assertEquals(metodoPago, event.getMetodoPago() );
        Mockito.verify(repository).getEventsBy("xxxx");

    }

    private List<DomainEvent> history() {
        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null)

        );    }

}