package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCajeroActualizado extends DomainEvent {
    public NombreCajeroActualizado(Cliente cliente) {
        super("NombreCajeroActualizado");
    }
}
