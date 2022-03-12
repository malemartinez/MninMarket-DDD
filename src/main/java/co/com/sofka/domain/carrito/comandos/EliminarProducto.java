package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.generic.Command;

public class EliminarProducto extends Command {

    private final CarritoID ID;
    private final ProductoID producto;

    public EliminarProducto(Producto producto, CarritoID ID) {
        this.producto = producto;
        this.ID = ID;
    }

    public CarritoID getID() {
        return ID;
    }

    public Producto getProducto() {
        return producto;
    }
}
