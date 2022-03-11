package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.*;
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

        apply((FacturaGenerada event)-> {
            carrito.generarFactura(event.getCajero(),event.getCliente(),event.getProductos(),event.getMetodoPago());
        });

        apply((ProductoAgregago event)-> {
            carrito.agregarProducto(event.getEntityId(),event.getNombre(),event.getDescripcion(),event.getPrecio());
        });

        apply((ProductoEliminado event)->{
            var producto = carrito.getProductoPorID(event.getEntityId()).orElseThrow();
            carrito.eliminarProducto(producto);
        } );

        apply((NombreCajeroActualizado event)->{
            var Cajero = carrito.cajero;
            Cajero.actualizarNombre(event.getCajero().Nombre());
        });

        apply((NombreClienteActualizado event)->{
            var Cliente = carrito.cliente;
            Cliente.actualizarNombre(event.getCajero().Nombre());
        });

        apply((TelefonoClienteActualizado event)->{
            var Cliente = carrito.cliente;
            Cliente.actualizarTelefono(event.getCliente().Telefono());
        });

        apply((TelefonoCajeroActualizado event)->{
            var Cajero = carrito.cajero;
            Cajero.actualizarTelefono(event.getCliente().Telefono());
        });
    }
}
