package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.Precio;
import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioProductoActualizado extends DomainEvent {

    private final ProductoId productoId;
    private final Precio precio;

    public PrecioProductoActualizado(ProductoId productoId, Precio precio) {
        super("sofka.estanteria.PrecioProductoActulizado");
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
