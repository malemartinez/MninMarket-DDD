package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.CarritoVaciado;
import co.com.sofka.domain.carrito.eventos.ProductoEliminado;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class CarritoChange extends EventChange {

    public CarritoChange(Carrito carrito) {

        apply((CarritoCreado event) ->{
            carrito.cajero = event.getCajero();
            carrito.cliente = event.getCliente();
            carrito.productos = new ArrayList<>();
        });

        apply((CarritoVaciado event )->{
            carrito.vaciarCarrito(event.getProductos());
        });



        apply((ProductoEliminado event)->{
            var producto = carrito.getProductoPorID(event.getEntityId()).orElseThrow();
            carrito.eliminarProducto(producto);
        } );
    }
}
