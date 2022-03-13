package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.generic.DomainEvent;

public class MetodoPagoElegido extends DomainEvent {

    private final MetodoPago metodoPago;
    private final CarritoID carritoID;
    public MetodoPagoElegido(CarritoID carritoID,MetodoPago metodoPago) {
        super("sofka.carrito.MetodoPagoElegido");
        this.metodoPago = metodoPago;
        this.carritoID = carritoID;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public CarritoID getCarritoID() {
        return carritoID;
    }
}
