package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;

public class OrdenPedido extends AggregateEvent<OrdenID> {

    public OrdenPedido(OrdenID entityId) {
        super(entityId);
    }
}
