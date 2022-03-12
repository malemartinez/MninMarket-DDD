package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.ActualizarNombreCajero;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;

public class ActualizarNombreClienteUseCase extends UseCase<RequestCommand<ActualizarNombreCajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCajero> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.crearCliente(ClienteID.of("hgsvfrcgh"),new Nombre("Oscar"), new Telefono("1254875"));
        carrito.actualizarNombreCajero(command.getCajero(),command.getNombre());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
