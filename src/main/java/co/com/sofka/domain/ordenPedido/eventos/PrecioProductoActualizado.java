package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Producto;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class PrecioProductoActualizado extends DomainEvent {


    public PrecioProductoActualizado(ProductoId productoId, Precio nuevoPrecio) {
        super("PrecioProductoActualizado");
    }
}
