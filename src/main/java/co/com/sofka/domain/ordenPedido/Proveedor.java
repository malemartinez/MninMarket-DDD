package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;
import co.com.sofka.domain.ordenPedido.valor.Telefono;

import java.util.Objects;

public class Proveedor extends Entity<ProveedorId> {

    private ProveedorId proveedorId;
    private Nombre nombre;
    private Telefono telefono;

    public Proveedor(ProveedorId entityId, ProveedorId proveedorId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.proveedorId = proveedorId;
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
    }


    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
