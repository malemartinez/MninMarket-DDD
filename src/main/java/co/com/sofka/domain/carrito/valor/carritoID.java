package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class carritoID extends Identity {

    private carritoID(String valor){
        super(valor);
    }

    public carritoID(){}
    public static carritoID of(String valor) {
        return new carritoID(valor);
    }

}
