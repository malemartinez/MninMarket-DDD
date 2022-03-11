package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.Command;

public class actualizarTelefonoCliente extends Command {
    private final carritoID ID;
    private final Cliente cliente;

    public actualizarTelefonoCliente(carritoID ID, Cliente cliente) {
        this.ID = ID;
        this.cliente = cliente;
    }

    public carritoID getID() {
        return ID;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
