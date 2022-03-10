package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;

public class TelefonoProveedorActualizado extends DomainEvent {

    private final Proveedor proveedor;

    public TelefonoProveedorActualizado(Proveedor proveedor) {
        super("sofka.ordenPedido.TelefonoProveedorActualizado");
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}
