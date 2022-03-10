package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.Precio;
import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioProductoActualizado extends DomainEvent {

    private ProductoId productoId;
    private Precio precio;

    public PrecioProductoActualizado(ProductoId productoId, Precio precio) {
        super("PrecioProductoActulizado");
        this.productoId = productoId;
        this.precio = precio;
    }



}
