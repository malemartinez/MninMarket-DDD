package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;
import co.com.sofka.domain.ordenPedido.valor.Telefono;

public class TelefonoProveedorActualizado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final Telefono telefono;

    public TelefonoProveedorActualizado(ProveedorId proveedorId, Telefono telefono) {
        super("sofka.ordenPedido.TelefonoProveedorActualizado");
        this.proveedorId = proveedorId;
        this.telefono = telefono;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
