package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
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
