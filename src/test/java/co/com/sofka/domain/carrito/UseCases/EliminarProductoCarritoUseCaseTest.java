package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.agregarProducto;
import co.com.sofka.domain.carrito.comandos.eliminarProducto;
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

        Carrito carrito = new Carrito(carritoID, new Total(0.00));

        //var commando2 = new agregarProducto(carritoID, );
        carrito.agregarProducto(ProductoID.of("dhgtr"), new Nombre("galletas"),new Descripcion("Ricas y deliciossas"),new Precio(185.25));
        carrito.agregarProducto(ProductoID.of("fearer"), new Nombre("pudin"),new Descripcion("Ricas y deliciossas"),new Precio(2585.25));
        carrito.agregarProducto(ProductoID.of("asfvr"), new Nombre("panes"),new Descripcion("Ricas y deliciossas"),new Precio(755.25));

        ProductoID productoEliminar = ProductoID.of("dhgtr");
       var command = new eliminarProducto(productoEliminar , carritoID);

       var usecase = new EliminarProductoCarritoUseCase();

        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (ProductoEliminado) events.get(0);
       Assertions.assertEquals("productoEliminado", event.type);



    }
}