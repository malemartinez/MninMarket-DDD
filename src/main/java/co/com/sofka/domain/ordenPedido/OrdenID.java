package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class OrdenID extends Identity {

    private OrdenID(String valor){
        super(valor);
    }

    public OrdenID(){

    }

    public static OrdenID of(String valor) {
        return new OrdenID(valor);
    }
}
