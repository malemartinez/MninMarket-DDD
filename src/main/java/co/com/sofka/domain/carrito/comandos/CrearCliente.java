package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {

    private final CarritoID carritoID;
    private final Nombre nombre;
    private final Telefono telefono;
    private final ClienteID clienteID;

    public CrearCliente( ClienteID clienteID, CarritoID carritoID, Nombre nombre, Telefono telefono) {
        this.carritoID = carritoID;
        this.nombre = nombre;
        this.telefono = telefono;
        this.clienteID = clienteID;

    }

    public CarritoID getCarritoID() {
        return carritoID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }
}
