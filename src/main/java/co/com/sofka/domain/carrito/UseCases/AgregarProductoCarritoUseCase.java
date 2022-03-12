package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.comandos.agregarProducto;

public class AgregarProductoCarritoUseCase extends UseCase<RequestCommand<agregarProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<agregarProducto> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.agregarProducto(command.getEntityId(), command.getNombre(), command.getDescripcion(), command.getPrecio());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
    }
}
