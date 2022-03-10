package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Proveedor;

public class NombreProveedorActualizado extends DomainEvent {
    public NombreProveedorActualizado(Proveedor proveedor) {
        super("NombreProveedorActualizado");
    }
}
