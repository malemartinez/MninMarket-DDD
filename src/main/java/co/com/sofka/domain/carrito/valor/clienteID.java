package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class clienteID extends Identity {

    private clienteID(String valor){
        super(valor);
    }

    public clienteID(){}
    public static clienteID of(String valor) {
        return new clienteID(valor);
    }
}
