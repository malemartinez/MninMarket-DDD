package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.ElegirMetodoPago;

public class ElegirMetodoPagoUseCase extends UseCase<RequestCommand<ElegirMetodoPago>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ElegirMetodoPago> elegirMetodoPagoRequestCommand) {
        var command = elegirMetodoPagoRequestCommand.getCommand();

        var carrito = Carrito.from(command.getCarritoID(),retrieveEvents());
        carrito.elegirMetodoPago(command.getMetodoPago());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
