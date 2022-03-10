package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
    private final String telefono;



    public Telefono(String telefono) {
        this.telefono = telefono;
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
    public String value() {
        return null;
    }
}
