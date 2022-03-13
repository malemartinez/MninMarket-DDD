package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.generic.Command;

public class ElegirMetodoPago extends Command {

    private final CarritoID carritoID;
    private final MetodoPago metodoPago;

    public ElegirMetodoPago(CarritoID carritoID, MetodoPago metodoPago) {
        this.carritoID = carritoID;
        this.metodoPago = metodoPago;
    }

    public CarritoID getCarritoID() {
        return carritoID;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
