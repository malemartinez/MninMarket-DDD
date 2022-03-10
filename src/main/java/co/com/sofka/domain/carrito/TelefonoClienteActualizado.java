package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoClienteActualizado extends DomainEvent {
    public TelefonoClienteActualizado(Cliente cliente) {
        super("TelefonoClienteActualizado");
    }
}
