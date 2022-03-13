package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.CrearCarrito;
import co.com.sofka.domain.carrito.comandos.CrearCliente;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.ClienteCreado;
import co.com.sofka.domain.carrito.eventos.NombreClienteActualizado;
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

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearClienteUseCaseTest {


    @Mock
    private DomainEventRepository repository;

    @Test
    void crearCliente(){
        //arrange
        CarritoID carritoID = CarritoID.of("xxxx");
        ClienteID clienteID = ClienteID.of("hgseh");

        var command = new CrearCliente(clienteID,carritoID,new Nombre("Aleja"),new Telefono("25847"));
        var usecase = new CrearClienteUseCase();
        //act

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carritoID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (ClienteCreado)events.get(0);
        Assertions.assertEquals("Sofka.Carrito.ClienteCreado", event.type);
        //Assertions.assertEquals(carritoID.value(),event.aggregateRootId());
    }

    private List<DomainEvent> history() {
        return List.of(
                new CarritoCreado(CarritoID.of("xxxx"),null),
                new ProductoAgregago(ProductoID.of("ffffff"),null,null,null),
                new ClienteCreado(ClienteID.of("hgseh"),new Nombre("Camilito"), new Telefono("154278"))
        );
    }
}