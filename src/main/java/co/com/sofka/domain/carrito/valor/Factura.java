package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.generic.ValueObject;

import java.util.List;

public class Factura implements ValueObject<facturaID> {

    private final Cajero cajero;
    private final Cliente cliente;
    private final List<Producto> productos;
    private final MetodoPago metodoPago;
    private final facturaID id;

    public Factura(Cajero cajero, Cliente cliente, List<Producto> productos, MetodoPago metodoPago, facturaID id) {
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
        this.metodoPago = metodoPago;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public facturaID value() {
        return null;
    }
}
