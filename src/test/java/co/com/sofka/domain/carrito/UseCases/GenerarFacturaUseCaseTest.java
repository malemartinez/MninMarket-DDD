package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.comandos.GenerarFactura;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.FacturaGenerada;
import co.com.sofka.domain.carrito.eventos.ProductoAgregago;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class GenerarFacturaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void GenerarFactura(){
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        CajeroID cajero = new CajeroID();
        ClienteID cliente = new ClienteID();
        MetodoPago pago = new MetodoPago(MetodoPago.Pago.EFECTIVO);
        List<Producto> productos = new ArrayList<>();
        productos.add(Producto.from(ProductoID.of("dhgtr"), null,null,new Precio(185.25) ));
        productos.add(Producto.from(ProductoID.of("fearer"), null,null,new Precio(2585.25) ));
        productos.add(Producto.from(ProductoID.of("asfvr"), null,null,new Precio(755.25) ));

        Total precio = new Total(50.52);
        var command = new GenerarFactura(cajero, cliente,productos,pago,carritoID,precio);

        var usecase = new GenerarFacturaUseCase();
        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carritoID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (FacturaGenerada) events.get(0);
        Assertions.assertEquals("sofka.carrito.FacturaGenerada", event.type);
        Assertions.assertEquals(cliente, event.getClienteID()  );
        Assertions.assertEquals( pago, event.getMetodoPago()  );
        //TODO: colocar las demas validaciones
    }

    private List<DomainEvent> history() {
        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null),
                new ProductoAgregago(ProductoID.of("ffffff"),null,null,null)

        );    }

}