package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.estanteria.valor.ProductoId;

public class eliminarProducto {

    private final EstanteriaId id;
    private final ProductoId entityId;

    public eliminarProducto(EstanteriaId id, ProductoId entityId) {
        this.id = id;
        this.entityId = entityId;
    }

    public EstanteriaId getId() {
        return id;
    }

    public ProductoId getEntityId() {
        return entityId;
    }
}
