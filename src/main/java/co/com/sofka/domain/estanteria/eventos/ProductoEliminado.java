package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {

    private final ProductoId entityId;

    public ProductoEliminado(ProductoId entityId) {
        super("sofka.estanteria.ProductoEliminado");
        this.entityId = entityId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }
}
