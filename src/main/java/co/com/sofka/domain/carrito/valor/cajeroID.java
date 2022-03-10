package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class cajeroID extends Identity {

    private cajeroID(String valor){
        super(valor);
    }

    public cajeroID(){}
    public static cajeroID of(String valor) {
        return new cajeroID(valor);
    }
}
