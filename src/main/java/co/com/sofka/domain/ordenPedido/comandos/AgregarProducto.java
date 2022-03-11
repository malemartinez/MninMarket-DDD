package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.valor.*;

public class AgregarProducto extends Command {

    private final OrdenID ordenID;
    private final ProductoId entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public AgregarProducto(OrdenID ordenID, ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        this.ordenID = ordenID;
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProductoId getEntityId() {
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
