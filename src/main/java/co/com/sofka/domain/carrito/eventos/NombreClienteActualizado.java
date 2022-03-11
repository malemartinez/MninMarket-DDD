package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private final ClienteID clienteID;
    private  final Nombre nombre;

    public NombreClienteActualizado(ClienteID clienteID, Nombre nombre) {
        super("sofka.Carrito.NombreClienteActualizado");
        this.clienteID = clienteID;
        this.nombre = nombre;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
