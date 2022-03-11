package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class ProductoEliminado extends DomainEvent {

    private final ProductoId entityId;

    public ProductoEliminado(ProductoId entityId) {
        super("sofka.ordenPedido.productoEliminado");
        this.entityId = entityId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }
}
