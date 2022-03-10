package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class productoID extends Identity {

    private productoID(String valor){
        super(valor);
    }

    public productoID(){}
    public static productoID of(String valor) {
        return new productoID(valor);
    }
}
