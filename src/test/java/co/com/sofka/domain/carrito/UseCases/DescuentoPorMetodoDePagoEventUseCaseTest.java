package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.carrito.comandos.CalcularTotal;
import co.com.sofka.domain.carrito.eventos.*;
import co.com.sofka.domain.carrito.valor.*;
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
    void asignarDescuentoPorPagoConEfectivo() {
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        var event = new MetodoPagoElegido(carritoID,new MetodoPago(MetodoPago.Pago.EFECTIVO));

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
        var evento = (TotalConDescuentoAsignado) events.get(events.size() -1);
        Mockito.verify(repository).getEventsBy("xxxx");
        Assertions.assertEquals("sofka.carrito.TotalConDescuentoAsignado", evento.type);
    }

    private List<DomainEvent> history() {

        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"), new Total(0.00)),

                new ProductoAgregago(ProductoID.of("gdhgrh"),new Nombre("galletas"),
                        new Descripcion("De chocolate "), new Precio(145.00)),
                new ProductoAgregago(ProductoID.of("reaffg"),new Nombre("Atun"),
                        new Descripcion("De aceite "), new Precio(58.1)),
                new ProductoAgregago(ProductoID.of("jdfhbv"),new Nombre("Papel Higienico"),
                        new Descripcion("Blanco suave y triple hoja "), new Precio(145.00)),
                new ProductoAgregago(ProductoID.of("fgbrt"),new Nombre("Mani"),
                        new Descripcion("con almendras"), new Precio(417.22)),
                new TotalCalculado(new Total(765.32)),
                new MetodoPagoElegido(CarritoID.of("xxxx"), new MetodoPago(MetodoPago.Pago.EFECTIVO))
        );
    }
}