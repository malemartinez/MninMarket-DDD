package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.comandos.EliminarProducto;
import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.ProductoID;

public class EliminarProductoCarritoUseCase extends UseCase<RequestCommand<EliminarProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarProducto> input) {
        var command = input.getCommand();

        var carrito = Carrito.from(command.getID(),retrieveEvents());

        carrito.agregarProducto(ProductoID.of("dhgtr"), new Nombre("galletas"),new Descripcion("Ricas y deliciossas"),new Precio(185.25));
        carrito.agregarProducto(ProductoID.of("fearer"), new Nombre("pudin"),new Descripcion("Ricas y deliciossas"),new Precio(2585.25));
        carrito.agregarProducto(ProductoID.of("asfvr"), new Nombre("panes"), new Descripcion("Ricas y deliciossas"), new Precio(755.25));

        carrito.eliminarProducto(command.getProducto());
        emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
}}
