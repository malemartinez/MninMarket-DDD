package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import co.com.sofka.domain.ordenPedido.OrdenPedido;
import co.com.sofka.domain.ordenPedido.comandos.CrearOrdenPedido;
import co.com.sofka.domain.ordenPedido.valor.*;

public class CrearOrdenPedidoUseCase extends UseCase<RequestCommand<CrearOrdenPedido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearOrdenPedido> input) {
        var command = input.getCommand();

        var ordenPedido = new OrdenPedido(command.getOrdenID(), new Fecha());

        emit().onResponse(new ResponseEvents(ordenPedido.getUncommittedChanges()));
    }
}
