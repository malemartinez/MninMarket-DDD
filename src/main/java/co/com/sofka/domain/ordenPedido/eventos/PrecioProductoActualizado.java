package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Producto;

public class PrecioProductoActualizado extends DomainEvent {


    public PrecioProductoActualizado(Producto producto, Precio nuevoPrecio) {
        super("PrecioProductoActualizado");
    }
}
