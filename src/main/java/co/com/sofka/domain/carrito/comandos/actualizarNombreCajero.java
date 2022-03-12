package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreCajero extends Command {

    private final CarritoID carritoID;
    private final CajeroID cajero;
    private final Nombre nombre;

    public actualizarNombreCajero(CarritoID ID, CajeroID cajero, Nombre nombre) {
        this.carritoID = ID;
        this.cajero = cajero;
        this.nombre = nombre;
    }


    public CarritoID getID() {
        return carritoID;
    }


    public Nombre getNombre() {
        return nombre;
    }

    public CajeroID getCajero() {
        return cajero;
    }
}
