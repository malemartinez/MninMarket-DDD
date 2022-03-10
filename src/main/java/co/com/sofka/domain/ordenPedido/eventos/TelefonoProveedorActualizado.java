package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;

public class TelefonoProveedorActualizado extends DomainEvent {
    public TelefonoProveedorActualizado(Proveedor proveedor) {
        super("TelefonoProveedorActualizado");
    }
}
