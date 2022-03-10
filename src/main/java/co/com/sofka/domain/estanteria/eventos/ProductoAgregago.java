package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.Descripcion;
import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.Precio;
import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAgregago extends DomainEvent {

    private final ProductoId entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public ProductoAgregago(ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        super("sofka.estanteria.ProductoAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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
