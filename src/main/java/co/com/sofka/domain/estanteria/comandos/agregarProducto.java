package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.valor.*;
import co.com.sofka.domain.generic.Command;

public class agregarProducto extends Command {

    private final EstanteriaId id;
    private final ProductoId entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public agregarProducto(EstanteriaId id, ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        this.id = id;
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public EstanteriaId getId() {
        return id;
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
