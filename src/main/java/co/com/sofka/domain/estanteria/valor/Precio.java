package co.com.sofka.domain.estanteria.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private Double precio;

    public Precio(Double precio) {
        this.precio = Objects.requireNonNull(precio);

    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public Double value() {
        return this.precio;
    }
}
