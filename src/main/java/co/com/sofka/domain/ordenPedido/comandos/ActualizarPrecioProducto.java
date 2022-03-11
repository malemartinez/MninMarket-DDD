package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.Precio;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class ActualizarPrecioProducto extends Command {

    private final OrdenID ordenID;
    private final ProductoId productoId;
    private final Precio precio;

    public ActualizarPrecioProducto(OrdenID ordenID, ProductoId productoId, Precio precio) {
        this.ordenID = ordenID;
        this.productoId = productoId;
        this.precio = precio;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
