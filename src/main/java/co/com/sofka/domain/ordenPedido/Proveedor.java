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

    protected Proveedor(ProveedorId proveedorId, Nombre nombre, Telefono telefono) {
        super(proveedorId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    private Proveedor(ProveedorId proveedorId){
        super(proveedorId);
    }

    public static Proveedor from(ProveedorId proveedorId, Nombre nombre, Telefono telefono){
        Proveedor nuevoProveedor = new Proveedor(proveedorId);
        nuevoProveedor.nombre = nombre;
        nuevoProveedor.telefono = telefono;
        return nuevoProveedor;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
    }


    public ProveedorId ProveedorId() {
        return proveedorId;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
