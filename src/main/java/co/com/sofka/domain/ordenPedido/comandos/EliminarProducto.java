package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class EliminarProducto extends Command {

    private final OrdenID ordenID;
    private final ProductoId entityId;

    public EliminarProducto(OrdenID ordenID, ProductoId entityId) {
        this.ordenID = ordenID;
        this.entityId = entityId;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProductoId getEntityId() {
        return entityId;
    }
}
