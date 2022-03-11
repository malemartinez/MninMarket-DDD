package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.generic.DomainEvent;

public class CajeroCreado extends DomainEvent {
    private final CajeroID id;
    private final Nombre nombre;
    private final Telefono telefono;

    public CajeroCreado(CajeroID id, Nombre nombre, Telefono telefono) {
        super("sofka.carrito.CajeroCreado");
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public CajeroID getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
