package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.carritoID;
import co.com.sofka.domain.generic.Command;

public class eliminarProducto extends Command {

    private final carritoID ID;
    private final Producto producto;

    public eliminarProducto(Producto producto,carritoID ID) {
        this.producto = producto;
        this.ID = ID;
    }

    public carritoID getID() {
        return ID;
    }

    public Producto getProducto() {
        return producto;
    }
}
