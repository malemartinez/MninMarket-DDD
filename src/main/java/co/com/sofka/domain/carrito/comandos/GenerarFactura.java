package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class GenerarFactura extends Command {

    private final CarritoID ID;
    private final CajeroID cajeroID;
    private final ClienteID clienteID;
    private final List<Producto> productos;
    private final MetodoPago metodoPago;
    private  final Total total;


    public GenerarFactura(CajeroID cajero, ClienteID cliente, List<Producto> productos, MetodoPago metodoPago, CarritoID ID, Total total ) {
        this.cajeroID = cajero;
        this.clienteID = cliente;
        this.productos = productos;
        this.metodoPago = metodoPago;
        this.ID = ID;
        this.total=total;
    }

    public CarritoID getID() {
        return ID;
    }

    public CajeroID getCajeroID() {
        return cajeroID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Total getTotal() {
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
