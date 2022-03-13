package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.MetodoPagoElegido;
import co.com.sofka.domain.carrito.eventos.ProductoAgregago;
import co.com.sofka.domain.carrito.eventos.TotalConDescuentoAsignado;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.carrito.valor.ProductoID;
import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DescuentoPorMetodoDePagoEventUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void asignarDescuentoPorPagoConTarjeta() {
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        var event = new MetodoPagoElegido(new MetodoPago(MetodoPago.Pago.EFECTIVO));

        var useCase = new DescuentoPorMetodoDePagoEventUseCase();
        Mockito.when(repository.getEventsBy(carritoID.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carritoID.value())
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var eventDescuentoCreado = (TotalConDescuentoAsignado) events.get(events.size() -1);
        Mockito.verify(repository).getEventsBy("xxxx");
        Assertions.assertEquals("sofka.carrito.TotalConDescuentoAsignado", event.type);
    }

    private List<DomainEvent> history() {

        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null)
        );
    }
}