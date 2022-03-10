package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class facturaID extends Identity {

    private facturaID(String valor){
        super(valor);
    }

    public facturaID(){}
    public static facturaID of(String valor) {
        return new facturaID(valor);
    }
}
