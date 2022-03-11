package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {

    private final productoID entityId;

    public ProductoEliminado(productoID entityId) {
        super("productoEliminado");
        this.entityId = entityId;


    }

    public productoID getEntityId() {
        return entityId;
    }
}
