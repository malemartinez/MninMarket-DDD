package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.ProductoID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {

    private final ProductoID entityId;

    public ProductoEliminado(ProductoID entityId) {
        super("productoEliminado");
        this.entityId = entityId;


    }

    public ProductoID getEntityId() {
        return entityId;
    }
}
