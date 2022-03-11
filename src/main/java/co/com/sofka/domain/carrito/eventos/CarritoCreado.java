package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.generic.DomainEvent;

public class CarritoCreado extends DomainEvent {

    private final CarritoID entityId;
    public CarritoCreado(CarritoID entityId) {
        super("sofka.carrito.Carritocreado");
        this.entityId = entityId;
    }

    public CarritoID getEntityId() {
        return entityId;
    }
}
