package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class CajeroID extends Identity {

    private CajeroID(String valor){
        super(valor);
    }

    public CajeroID(){}
    public static CajeroID of(String valor) {
        return new CajeroID(valor);
    }
}
