package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

public class OrdenPedido extends AggregateEvent<OrdenID> {


    public OrdenPedido(OrdenID entityId) {
        super(entityId);
    }
}
