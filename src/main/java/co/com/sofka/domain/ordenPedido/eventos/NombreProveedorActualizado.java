package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;

public class NombreProveedorActualizado extends DomainEvent {

    private final Proveedor proveedor;

    public NombreProveedorActualizado(Proveedor proveedor) {
        super("sofka.ordenPedido.NombreProveedorActualizado");
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}
