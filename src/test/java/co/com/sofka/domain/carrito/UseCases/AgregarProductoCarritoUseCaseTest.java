package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.AgregarProducto;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.ProductoAgregago;
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
class AgregarProductoCarritoUseCaseTest {



    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarProducto(){
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        ProductoID productoID = ProductoID.of("ffffff");
        Nombre nombre = new Nombre("Caja de cereales");
        Descripcion descripcion = new Descripcion("Contiene trozitos ricos ");
        Precio precio = new Precio(50.52);


        var command = new AgregarProducto(carritoID,productoID,nombre,descripcion,precio);

       var usecase = new AgregarProductoCarritoUseCase();


       Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
       usecase.addRepository(repository);
        //act

       var events = UseCaseHandler.getInstance()
                       .setIdentifyExecutor(carritoID.value())
                       .syncExecutor(usecase, new RequestCommand<>(command))
                       .orElseThrow()
                       .getDomainEvents();
        //assert

        var event = (ProductoAgregago) events.get(0);
        Assertions.assertEquals("sofka.Carrito.Productoagregago", event.type);
        Assertions.assertEquals("Caja de cereales", event.getNombre().value()  );
        Assertions.assertEquals("ffffff", event.getEntityId().value()  );

    }

    private List<DomainEvent> history() {
        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null),
               new ProductoAgregago(ProductoID.of("ffffff"),null,null,null)

        );    }

}