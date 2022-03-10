package co.com.sofka.domain.estanteria.valor;

import co.com.sofka.domain.generic.Identity;

public class SurtidorId extends Identity {

    private SurtidorId(String valor){
        super(valor);
    }

    public SurtidorId(){

    }

    public static SurtidorId of(String valor) {
        return new SurtidorId(valor);
    }
}
