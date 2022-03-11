package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.Command;

public class agregarProducto extends Command {

    private final CarritoID ID;
    private final ProductoID entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public CarritoID getID() {
        return ID;
    }

    public agregarProducto(CarritoID ID, ProductoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        this.ID = ID;
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ProductoID getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }


}
