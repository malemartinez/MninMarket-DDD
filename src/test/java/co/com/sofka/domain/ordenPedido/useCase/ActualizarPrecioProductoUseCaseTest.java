package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.comandos.ActualizarNombreProveedor;
import co.com.sofka.domain.ordenPedido.comandos.ActualizarPrecioProducto;
import co.com.sofka.domain.ordenPedido.comandos.AgregarProducto;
import co.com.sofka.domain.ordenPedido.eventos.NombreProveedorActualizado;
import co.com.sofka.domain.ordenPedido.eventos.OrdenPedidoCreado;
import co.com.sofka.domain.ordenPedido.eventos.PrecioProductoActualizado;
import co.com.sofka.domain.ordenPedido.eventos.ProveedorCreado;
import co.com.sofka.domain.ordenPedido.valor.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActualizarPrecioProductoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarPrecioProducto(){
        //arrange
        OrdenID ordenID = OrdenID.of("xxxx");

        var agregarProducto = new AgregarProducto(ordenID, ProductoId.of("ghfrg"),
                new Nombre("Galletas"),
                new Descripcion("trozoss"),
                new Precio(1457.11) );

        var command = new ActualizarPrecioProducto(ordenID, ProductoId.of("ghfrg"),new Precio(20.144));

        var usecase = new ActualizarPrecioProductoUseCase();

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ordenID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PrecioProductoActualizado) events.get(events.size() -1);

        Assertions.assertEquals("sofka.ordenPedido.PrecioProductoActualizado", event.type);
        Assertions.assertEquals( 20.144 , event.getPrecio().value());
        Mockito.verify(repository).getEventsBy("xxxx");

    }

    private List<DomainEvent> history() {
        return List.of(
                new OrdenPedidoCreado(OrdenID.of("xxxx"), new Fecha())


        );
    }

}