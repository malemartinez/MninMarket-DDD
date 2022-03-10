package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {

    private ProductoId(String valor){
        super(valor);
    }

    public ProductoId(){

    }

    public static ProductoId of(String valor) {
        return new ProductoId(valor);
    }
}
