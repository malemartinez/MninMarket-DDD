package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class MetodoPago implements ValueObject<MetodoPago.Pago> {
    private final Pago value;

    public MetodoPago(Pago value) {
        this.value = value;
    }


    @Override
    public Pago value() {

        return value ;
    }

    public enum Pago {
        EFECTIVO,
        TARJETA,
        OTRO
    }
}
