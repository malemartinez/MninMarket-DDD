package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.Command;

public class actualizarTelefonoCajero extends Command {

    private final CarritoID ID;
    private final CajeroID cajeroID;
    private final Telefono telefono;

    public actualizarTelefonoCajero(CarritoID ID, CajeroID cajeroID, Telefono telefono) {
        this.ID = ID;
        this.cajeroID = cajeroID;
        this.telefono = telefono;
    }

    public CarritoID getID() {
        return ID;
    }

    public CajeroID getCajeroID() {
        return cajeroID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
