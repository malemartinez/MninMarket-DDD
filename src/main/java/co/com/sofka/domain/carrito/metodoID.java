package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.Identity;

public class metodoID extends Identity {

    private metodoID(String valor){
        super(valor);
    }

    public metodoID(){}
    public static metodoID of(String valor) {
        return new metodoID(valor);
    }
}
