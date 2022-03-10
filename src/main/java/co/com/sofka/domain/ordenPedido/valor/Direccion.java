package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {


    private final String direccion;


    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String value() {
        return direccion;
    }

}
