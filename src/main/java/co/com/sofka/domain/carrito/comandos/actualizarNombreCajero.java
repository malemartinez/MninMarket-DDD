package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.carritoID;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreCajero extends Command {

    private final carritoID ID;
    private final Cajero cajero;

    public actualizarNombreCajero(carritoID ID, Cajero cajero) {
        this.ID = ID;
        this.cajero = cajero;
    }

    public carritoID getID() {
        return ID;
    }

    public Cajero getCliente() {
        return cajero;
    }
}
