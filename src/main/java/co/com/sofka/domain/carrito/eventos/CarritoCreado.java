package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class CarritoCreado extends DomainEvent {

    private final CarritoID entityId;
    private final Total total;
    public CarritoCreado(CarritoID entityId ,Total total) {
        super("sofka.carrito.Carritocreado");
        this.entityId = entityId;
        this.total = total;
    }

    public CarritoID getEntityId() {
        return entityId;
    }

    public Total getTotal() {
        return total;
    }
}
