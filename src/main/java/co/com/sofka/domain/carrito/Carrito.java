package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Objects;

public class Carrito extends AggregateEvent<carritoID> {
    protected Cajero cajero;
    protected Cliente cliente;
    protected List<Producto> productos;
    protected Factura factura;
    protected MetodoPago metodoPago;

    public Carrito(carritoID entityId, Cajero cajero, Cliente cliente) {
        super(entityId);
        this.cajero = cajero;
        this.cliente = cliente;
        appendChange(new CarritoCreado(cajero,cliente)).apply();
    }

    private Carrito(carritoID entityId) {
        super(entityId);

    }

    public void agregarProducto(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregago(entityId, nombre, descripcion, precio)).apply();

    }

    public void eliminarProducto(productoID entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoEliminado(entityId)).apply();
    }
}
