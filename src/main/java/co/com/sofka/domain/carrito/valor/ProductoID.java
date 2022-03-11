package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.Identity;

public class ProductoID extends Identity {

    private ProductoID(String valor){
        super(valor);
    }

    public ProductoID(){}
    public static ProductoID of(String valor) {
        return new ProductoID(valor);
    }
}
