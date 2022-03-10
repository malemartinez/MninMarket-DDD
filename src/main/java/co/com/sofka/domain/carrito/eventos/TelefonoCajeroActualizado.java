package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCajeroActualizado extends DomainEvent {
    public TelefonoCajeroActualizado(Cliente cliente) {
        super("TelefonoCajeroActualizado");
    }
}
