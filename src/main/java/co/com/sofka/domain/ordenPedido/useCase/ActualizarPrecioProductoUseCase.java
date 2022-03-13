package co.com.sofka.domain.ordenPedido.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ordenPedido.OrdenPedido;
import co.com.sofka.domain.ordenPedido.comandos.ActualizarPrecioProducto;
import co.com.sofka.domain.ordenPedido.valor.Descripcion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Precio;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;


public class ActualizarPrecioProductoUseCase extends UseCase<RequestCommand<ActualizarPrecioProducto>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ActualizarPrecioProducto> input) {
        var command = input.getCommand();

        var ordenPedido = OrdenPedido.from(command.getOrdenID(),retrieveEvents());
        ordenPedido.agregarProducto(ProductoId.of("ghfrg"),
                new Nombre("Galletas"),
                new Descripcion("trozoss"),
                new Precio(1457.11));

        ordenPedido.actualizarPrecioProducto(command.getProductoId(),command.getPrecio());
        emit().onResponse(new ResponseEvents(ordenPedido.getUncommittedChanges()));
    }
}
