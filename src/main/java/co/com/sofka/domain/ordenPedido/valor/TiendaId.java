package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.Identity;

public class TiendaId extends Identity{

    private TiendaId(String valor){
        super(valor);
    }

    public TiendaId(){

    }

    public static TiendaId of(String valor) {
        return new TiendaId(valor);
    }
}
