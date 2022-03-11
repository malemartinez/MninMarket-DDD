package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoClienteActualizado extends DomainEvent {
    private final ClienteID clienteID;
    private  final Telefono telefono;

    public TelefonoClienteActualizado(ClienteID clienteID, Telefono telefono) {
        super("TelefonoClienteActualizado");
        this.clienteID = clienteID;
        this.telefono = telefono;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
