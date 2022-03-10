package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreSurtidorActualizado extends DomainEvent {
    public NombreSurtidorActualizado(Cliente cliente) {
        super("NombreSurtidorActualizado");
    }
}
