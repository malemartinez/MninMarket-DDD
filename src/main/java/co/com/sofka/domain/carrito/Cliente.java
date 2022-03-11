package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.carrito.valor.clienteID;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<clienteID> {
    private Nombre nombre;
    private Telefono telefono;

    protected Cliente(clienteID entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    private Cliente (clienteID entityId){
        super(entityId);
    }

    public static Cliente from(clienteID entityId, Nombre nombre, Telefono telefono){
        var nuevoCliente = new Cliente(entityId);
        nuevoCliente.nombre = nombre;
        nuevoCliente.telefono = telefono;
        return nuevoCliente;

    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = nuevoTelefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }


}