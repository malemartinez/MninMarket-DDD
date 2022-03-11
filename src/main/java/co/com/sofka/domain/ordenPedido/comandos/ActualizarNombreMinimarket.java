package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

public class ActualizarNombreMinimarket extends Command {

    private final OrdenID ordenID;
    private final MiniMarket miniMarket;

    public ActualizarNombreMinimarket(OrdenID ordenID, MiniMarket miniMarket) {
        this.ordenID = ordenID;
        this.miniMarket = miniMarket;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public MiniMarket getMiniMarket() {
        return miniMarket;
    }
}
