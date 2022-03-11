package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.generic.Command;

public class actualizarTelefonoCajero extends Command {

    private final carritoID ID;
    private final Cajero cajero;

    public actualizarTelefonoCajero(carritoID ID, Cajero cajero) {
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
