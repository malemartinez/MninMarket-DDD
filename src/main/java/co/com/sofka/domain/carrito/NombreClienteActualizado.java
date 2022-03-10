package co.com.sofka.domain.carrito;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private Cliente cliente;

    public NombreClienteActualizado(Cliente cliente) {
        super("NombreClienteActualizado");
    }
}
