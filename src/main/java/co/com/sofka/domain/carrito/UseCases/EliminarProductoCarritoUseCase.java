package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.eliminarProducto;

public class EliminarProductoCarritoUseCase extends UseCase<RequestCommand<eliminarProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<eliminarProducto> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());
        carrito.eliminarProducto(command.getProducto());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
}}
