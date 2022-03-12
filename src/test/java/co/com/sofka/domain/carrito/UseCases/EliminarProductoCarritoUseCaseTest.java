package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.EliminarProducto;


import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.ProductoAgregago;
import co.com.sofka.domain.carrito.eventos.ProductoEliminado;
import co.com.sofka.domain.carrito.valor.*;

import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class EliminarProductoCarritoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void eliminarProducto(){
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");

        var command = new EliminarProducto(ProductoID.of("dhgtr") , carritoID);

        var usecase = new EliminarProductoCarritoUseCase();

        //act

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carritoID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (ProductoEliminado) events.get(events.size() - 1);
        Assertions.assertEquals("productoEliminado", event.type);
        Assertions.assertEquals("dhgtr",event.getEntityId().value());

    }


    private List<DomainEvent> history() {
        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null),
                new ProductoAgregago(ProductoID.of("dhgtr"), new Nombre("galletas"),new Descripcion("Ricas y deliciossas"),new Precio(185.25)),
                new ProductoAgregago(ProductoID.of("fearer"), new Nombre("pudin"),new Descripcion("Ricas y deliciossas"),new Precio(2585.25)),
                new ProductoAgregago(ProductoID.of("asfvr"), new Nombre("panes"), new Descripcion("Ricas y deliciossas"), new Precio(755.25))

        );    }
}