package co.com.sofka.domain.ordenPedido.eventos;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.Producto;
import co.com.sofka.domain.ordenPedido.valor.Descripcion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Precio;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class ProductoAgregado extends DomainEvent {

    private final ProductoId entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public ProductoAgregado(ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
        super("sofka.ordenPedido.ProductoAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
