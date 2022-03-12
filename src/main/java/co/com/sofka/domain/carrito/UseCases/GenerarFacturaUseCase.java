package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.GenerarFactura;

public class GenerarFacturaUseCase extends UseCase<RequestCommand<GenerarFactura>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<GenerarFactura> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.generarFactura(command.getClienteID(),command.getCajeroID(),command.getTotal(),command.getMetodoPago());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
