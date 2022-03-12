package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
    private final ClienteID id;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteCreado(ClienteID id , Nombre nombre, Telefono telefono) {
        super("Sofka.Carrito.ClienteCreado");
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ClienteID getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
