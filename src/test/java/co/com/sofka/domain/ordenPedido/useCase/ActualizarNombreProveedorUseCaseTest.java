package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.comandos.ActualizarNombreProveedor;
import co.com.sofka.domain.ordenPedido.eventos.NombreProveedorActualizado;
import co.com.sofka.domain.ordenPedido.eventos.OrdenPedidoCreado;
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
class ActualizarNombreProveedorUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizaNombreProveedor(){
        //arrange
        OrdenID ordenID = OrdenID.of("xxxx");
        Nombre nombre = new Nombre("Juan");

        var command = new ActualizarNombreProveedor(ordenID, nombre);
        var usecase = new ActualizarNombreProveedorUseCase();

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ordenID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (NombreProveedorActualizado) events.get(0);

        Assertions.assertEquals("sofka.ordenPedido.NombreProveedorActualizado", event.type);
        Assertions.assertEquals("Juan", event.getNombre().value() );
        Mockito.verify(repository).getEventsBy("xxxx");

    }

    private List<DomainEvent> history() {
        return List.of(
                new OrdenPedidoCreado(OrdenID.of("xxxx"), new Fecha()),
                new ProveedorCreado(ProveedorId.of("gggg"),new Nombre("bbbb"), new Telefono("12345"))

        );
    }

}