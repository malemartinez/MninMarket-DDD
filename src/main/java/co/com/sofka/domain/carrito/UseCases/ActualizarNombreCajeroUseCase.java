package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.ActualizarNombreCajero;


public class ActualizarNombreCajeroUseCase extends UseCase<RequestCommand<ActualizarNombreCajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCajero> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.actualizarNombreCajero(command.getNombre());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
