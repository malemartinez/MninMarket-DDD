package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreCajeroActualizado extends DomainEvent {
    public NombreCajeroActualizado(Cliente cliente) {
        super("NombreCajeroActualizado");
    }
}
