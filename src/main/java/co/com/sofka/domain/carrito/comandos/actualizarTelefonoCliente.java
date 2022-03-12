package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.Command;

public class actualizarTelefonoCliente extends Command {
    private final CarritoID ID;
    private final ClienteID clienteID;
    private final Telefono telefono;

    public actualizarTelefonoCliente(CarritoID ID, ClienteID clienteID, Telefono telefono) {
        this.ID = ID;
        this.clienteID = clienteID;
        this.telefono = telefono;
    }

    public CarritoID getID() {
        return ID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
