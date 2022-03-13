package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.generic.DomainEvent;

public class MetodoPagoElegido extends DomainEvent {

    private final MetodoPago metodoPago;
    public MetodoPagoElegido(MetodoPago metodoPago) {
        super("sofka.carrito.MetodoPagoElegido");
        this.metodoPago = metodoPago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
