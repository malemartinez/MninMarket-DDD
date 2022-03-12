package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.*;
import co.com.sofka.domain.carrito.valor.Factura;
import co.com.sofka.domain.carrito.eventos.ClienteCreado;
import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class CarritoChange extends EventChange {

    public CarritoChange(Carrito carrito) {

        apply((CarritoCreado event) ->{
            carrito.productos = new ArrayList<>();
            carrito.total = new Total(0.00);
        });

        apply((ClienteCreado event)->{
            carrito.cliente = new Cliente(event.getId(),event.getNombre(),event.getTelefono());
        });

        apply((CajeroCreado event)->{
            carrito.cajero = new Cajero(event.getId(),event.getNombre(),event.getTelefono());
        });

        apply((CarritoVaciado event )->{
            carrito.productos.clear();
        });

        apply((ProductoAgregago event)-> {
            var NuevoProducto = new Producto(event.getEntityId(),event.getNombre(),event.getDescripcion(),event.getPrecio());
            carrito.productos.add(NuevoProducto);

        });

        apply((ProductoEliminado event)->{
            var producto = carrito.getProductoPorID(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el producto"));
            carrito.productos.remove(producto);

        } );


        apply((FacturaGenerada event)-> {
            carrito.factura = new Factura(event.getClienteID(),event.getCajeroID(),event.getPago(),event.getMetodoPago());

        });

        apply((TotalCalculado event)->{
            carrito.total = event.getTotal();
        });

        apply((NombreCajeroActualizado event)->{
            var Cajero = carrito.cajero;
            Cajero.actualizarNombre(event.getNombre());
        });

        apply((NombreClienteActualizado event)->{
            var Cliente = carrito.cliente;
            Cliente.actualizarNombre(event.getNombre());
        });

        apply((TelefonoClienteActualizado event)->{
            var Cliente = carrito.cliente;
            Cliente.actualizarTelefono(event.getTelefono());
        });

        apply((TelefonoCajeroActualizado event)->{
            var Cajero = carrito.cajero;
            Cajero.actualizarTelefono(event.getTelefono());
        });
    }
}
