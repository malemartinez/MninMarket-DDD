package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCajeroActualizado extends DomainEvent {
    public TelefonoCajeroActualizado(Cliente cliente) {
        super("TelefonoCajeroActualizado");
    }
}
