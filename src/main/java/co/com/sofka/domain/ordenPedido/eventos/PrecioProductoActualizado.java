package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class PrecioProductoActualizado extends DomainEvent {

    private final ProductoId productoId;
    private final Precio precio;

    public PrecioProductoActualizado(ProductoId productoId, Precio precio) {
        super("sofka.ordenPedido.PrecioProductoActualizado");
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
