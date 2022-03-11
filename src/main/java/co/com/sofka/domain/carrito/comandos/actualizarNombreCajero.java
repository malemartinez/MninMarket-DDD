package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreCajero extends Command {

    private final CarritoID ID;
    private final Cajero cajero;

    public actualizarNombreCajero(CarritoID ID, Cajero cajero) {
        this.ID = ID;
        this.cajero = cajero;
    }

    public CarritoID getID() {
        return ID;
    }

    public Cajero getCliente() {
        return cajero;
    }
}
