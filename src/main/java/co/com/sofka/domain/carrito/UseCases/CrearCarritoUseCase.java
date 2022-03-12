package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.CrearCarrito;
import co.com.sofka.domain.carrito.valor.CarritoID;


public class CrearCarritoUseCase extends UseCase<RequestCommand<CrearCarrito>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCarrito> input) {
              var command = input.getCommand();
              var Carrito = new Carrito(command.getEntityId(),command.getTotal());
              emit().onResponse(new ResponseEvents(Carrito.getUncommittedChanges()));
    }
}
