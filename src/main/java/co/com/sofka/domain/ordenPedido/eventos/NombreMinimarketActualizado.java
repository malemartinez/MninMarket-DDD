package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class NombreMinimarketActualizado extends DomainEvent {

    private final MiniMarket miniMarket;

    public NombreMinimarketActualizado(MiniMarket miniMarket) {
        super("sofka.ordenPedido.NombreMinimarketActualizado");
        this.miniMarket = miniMarket;
    }

    public MiniMarket getMiniMarket() {
        return miniMarket;
    }
}
