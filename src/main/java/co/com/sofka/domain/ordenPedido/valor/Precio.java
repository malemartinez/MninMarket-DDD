package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {

    private Double precio;

    public Precio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public Double value() {
        return this.precio;
    }
}
