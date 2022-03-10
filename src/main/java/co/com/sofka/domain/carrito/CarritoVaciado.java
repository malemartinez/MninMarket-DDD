package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class CarritoVaciado extends DomainEvent {

    public CarritoVaciado() {
        super("CarritoVaciado");
    }
}
