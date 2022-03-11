package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.carritoID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CarritoCreado extends DomainEvent {

    private final carritoID entityId;
    public CarritoCreado(carritoID entityId) {
        super("sofka.carrito.Carritocreado");
        this.entityId = entityId;
    }

    public carritoID getEntityId() {
        return entityId;
    }
}
