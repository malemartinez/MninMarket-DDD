package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCajeroActualizado extends DomainEvent {

    private final Cajero cajero;
    public TelefonoCajeroActualizado(Cajero cajero) {
        super("TelefonoCajeroActualizado");
        this.cajero=cajero;
    }

    public Cajero getCliente() {
        return cajero;
    }
}
