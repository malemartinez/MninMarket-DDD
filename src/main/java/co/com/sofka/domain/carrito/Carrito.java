package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Cajero;
import co.com.sofka.domain.carrito.valor.carritoID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Carrito extends AggregateEvent<carritoID> {
    protected Cajero cajero;
    protected Cliente cliente;
    protected List<Productos> productos;
    protected Factura factura;
    protected MetodoPago metodoPago;

    public Carrito(carritoID entityId) {
        super(entityId);
    }
}
