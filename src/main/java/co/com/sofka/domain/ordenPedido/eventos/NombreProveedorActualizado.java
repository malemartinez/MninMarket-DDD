package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;

public class NombreProveedorActualizado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final Nombre nombre;

    public NombreProveedorActualizado(ProveedorId proveedorId, Nombre nombre) {
        super("sofka.ordenPedido.NombreProveedorActualizado");
        this.proveedorId = proveedorId;
        this.nombre = nombre;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
