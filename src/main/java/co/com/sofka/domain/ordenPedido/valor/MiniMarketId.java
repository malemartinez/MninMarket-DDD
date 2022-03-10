package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class MiniMarketId extends Identity{

    private MiniMarketId(String valor){
        super(valor);
    }

    public MiniMarketId(){

    }

    public static MiniMarketId of(String valor) {
        return new MiniMarketId(valor);
    }
}
