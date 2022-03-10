package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class FacturaGenerada extends DomainEvent {
    public FacturaGenerada() {
        super("FacturaGenerada");
    }
}
