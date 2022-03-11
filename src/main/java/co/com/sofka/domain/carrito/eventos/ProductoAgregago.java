package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.ProductoID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAgregago extends DomainEvent {

    private final ProductoID entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public ProductoAgregago(ProductoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        super("sofka.Carrito.Productoagregago");
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


