package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoSurtidorActualizado extends DomainEvent {
    public TelefonoSurtidorActualizado(Cliente cliente) {
        super("TelefonoSurtidorActualizado");
    }
}
