package co.com.sofka.domain.estanteria.valor;

import co.com.sofka.domain.generic.Identity;

public class EstanteriaId extends Identity {

    private EstanteriaId(String valor){
        super(valor);
    }

    public EstanteriaId(){

    }

    public static EstanteriaId of(String valor) {
        return new EstanteriaId(valor);
    }
}
