package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ordenPedido.OrdenPedido;
import co.com.sofka.domain.ordenPedido.comandos.ActualizarNombreProveedor;

public class ActualizarNombreProveedorUseCase extends UseCase<RequestCommand<ActualizarNombreProveedor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreProveedor> actualizarNombreProveedorRequestCommand) {
        var command = actualizarNombreProveedorRequestCommand.getCommand();

        var ordenPedido = OrdenPedido.from(command.getOrdenID(), retrieveEvents(command.getOrdenID().value()));
        ordenPedido.actualizarNombreProveedor(command.getNombre());
        emit().onResponse(new ResponseEvents(ordenPedido.getUncommittedChanges()));
    }
}
