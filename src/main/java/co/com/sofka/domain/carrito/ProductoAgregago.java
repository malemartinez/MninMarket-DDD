package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAgregago extends DomainEvent {
    public ProductoAgregago(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        super("Productoagregago");
    }
}
