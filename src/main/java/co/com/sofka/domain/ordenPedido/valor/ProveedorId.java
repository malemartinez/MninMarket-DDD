package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.Identity;

public class ProveedorId extends Identity {

    private ProveedorId(String valor){
        super(valor);
    }

    public ProveedorId(){

    }

    public static ProveedorId of(String valor) {
        return new ProveedorId(valor);
    }
}
