package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.carrito.valor.carritoID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class generarFactura extends Command {

    private final carritoID ID;
    private final Cajero cajero;
    private final Cliente cliente;
    private final List<Producto> productos;
    private final MetodoPago metodoPago;


    public generarFactura(Cajero cajero, Cliente cliente, List<Producto> productos, MetodoPago metodoPago,carritoID ID ) {
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
        this.metodoPago = metodoPago;
        this.ID = ID;
    }

    public carritoID getID() {
        return ID;
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
