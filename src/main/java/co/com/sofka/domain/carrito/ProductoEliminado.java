package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {


    public ProductoEliminado(productoID entityId) {
        super("productoEliminado");


    }
}
