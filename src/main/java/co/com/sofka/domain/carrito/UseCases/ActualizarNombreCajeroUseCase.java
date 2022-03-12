package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.actualizarNombreCajero;


public class ActualizarNombreCajeroUseCase extends UseCase<RequestCommand<actualizarNombreCajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<actualizarNombreCajero> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.actualizarNombreCajero(command.getCajero(),command.getNombre());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
