package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private final Cliente cliente;

    public NombreClienteActualizado(Cliente cliente) {
        super("sofka.Carrito.NombreClienteActualizado");
        this.cliente = cliente;
    }

    public Cliente getCajero() {
        return cliente;
    }
}
