package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class FacturaGenerada extends DomainEvent {

    private final Cajero cajero;
    private final Cliente cliente;
    private final List<Producto> productos;
    private final MetodoPago metodoPago;


    public FacturaGenerada(Cajero cajero, Cliente cliente, List<Producto> productos, MetodoPago metodoPago) {
        super("sofka.Carrito.FacturaGenerada");
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
        this.metodoPago = metodoPago;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
