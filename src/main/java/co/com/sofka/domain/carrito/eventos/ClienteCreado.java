package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.carrito.valor.clienteID;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
    private final clienteID id;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteCreado(clienteID id , Nombre nombre, Telefono telefono) {
        super("ClienteCreado");
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public clienteID getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
