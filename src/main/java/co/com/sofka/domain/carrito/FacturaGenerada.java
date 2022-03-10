package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class FacturaGenerada extends DomainEvent {
    public FacturaGenerada() {
        super("FacturaGenerada");
    }
}
