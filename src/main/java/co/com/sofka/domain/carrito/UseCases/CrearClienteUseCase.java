package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.comandos.CrearCliente;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCliente> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getCarritoID(),retrieveEvents());

        carrito.crearCliente(command.getClienteID(),command.getNombre(),command.getTelefono());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
