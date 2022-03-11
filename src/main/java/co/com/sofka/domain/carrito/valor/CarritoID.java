package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class CarritoID extends Identity {

    private CarritoID(String valor) {
        super(valor);
    }

    public CarritoID() {
    }

    public static CarritoID of(String valor){
        return new CarritoID(valor);
    }
}
