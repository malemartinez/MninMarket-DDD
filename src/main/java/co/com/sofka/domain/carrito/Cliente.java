package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.carrito.valor.clienteID;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<clienteID> {
    private Nombre nombre;
    private Telefono telefono;

    public Cliente(clienteID entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void cambiarNombre(Nombre nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void cambiarTelefono(Telefono nuevoTelefono){
        this.telefono = nuevoTelefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}