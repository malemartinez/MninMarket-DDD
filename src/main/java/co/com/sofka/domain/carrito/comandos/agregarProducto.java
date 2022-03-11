package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.Command;

public class agregarProducto extends Command {

    private final carritoID ID;
    private final productoID entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public agregarProducto(carritoID ID, productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        this.ID = ID;
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public productoID getEntityId() {
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
