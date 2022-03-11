package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.estanteria.valor.Precio;
import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.Command;

public class actualizarPrecioProducto extends Command {

    private final EstanteriaId id;
    private final ProductoId productoId;
    private final Precio nuevoPrecio;

    public actualizarPrecioProducto(EstanteriaId id, ProductoId productoId, Precio nuevoPrecio) {
        this.id = id;
        this.productoId = productoId;
        this.nuevoPrecio = nuevoPrecio;
    }

    public EstanteriaId getId() {
        return id;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getNuevoPrecio() {
        return nuevoPrecio;
    }
}
