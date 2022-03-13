package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ordenPedido.comandos.CrearOrdenPedido;
import co.com.sofka.domain.ordenPedido.eventos.OrdenPedidoCreado;
import co.com.sofka.domain.ordenPedido.valor.Fecha;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearOrdenPedidoUseCaseTest {

    @Test
    void crearOrdenPedido(){
        //arrange
        OrdenID ordenID = new OrdenID();
        Fecha fecha= new Fecha();

        var command = new CrearOrdenPedido(ordenID,fecha);
        var usecase = new CrearOrdenPedidoUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (OrdenPedidoCreado)events.get(0);
        Assertions.assertEquals("sofka.ordenPedido.OrdenPedidoCreado", event.type);
        Assertions.assertEquals(ordenID.value(),event.aggregateRootId());
}}