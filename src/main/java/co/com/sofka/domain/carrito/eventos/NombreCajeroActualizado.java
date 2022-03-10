package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCajeroActualizado extends DomainEvent {

    private final Cajero cajero;

    public NombreCajeroActualizado(Cajero cajero) {
        super("sofka.Carrito.NombreCajeroActualizado");
        this.cajero = cajero;
    }

    public Cajero getCajero() {
        return cajero;
    }
}
