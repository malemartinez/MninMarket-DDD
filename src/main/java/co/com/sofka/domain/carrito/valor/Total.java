package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Total implements ValueObject<Double> {


    private Double sumarPrecios (Double price){
        Double sumatoria = null;
        return sumatoria += price;
    }
    @Override
    public Double value() {
        return null;
    }
}
