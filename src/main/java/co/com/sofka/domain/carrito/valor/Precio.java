package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {

    private final Double precio;

    public Precio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Double value() {
        return null;
    }
}
