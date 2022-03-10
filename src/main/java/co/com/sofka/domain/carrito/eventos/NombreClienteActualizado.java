package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private Cliente cliente;

    public NombreClienteActualizado(Cliente cliente) {
        super("NombreClienteActualizado");
    }
}
