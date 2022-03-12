package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;
import co.com.sofka.domain.ordenPedido.valor.Telefono;

public class ProveedorCreado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ProveedorCreado(ProveedorId proveedorId, Nombre nombre, Telefono telefono) {
        super("sofka.ordenPedido.ProveedorCreado");
        this.proveedorId = proveedorId;
        this.nombre = nombre;
        this.telefono = telefono;
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
