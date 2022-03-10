package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoClienteActualizado extends DomainEvent {
    private final Cliente cliente;

    public TelefonoClienteActualizado(Cliente cliente) {
        super("TelefonoClienteActualizado");
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
