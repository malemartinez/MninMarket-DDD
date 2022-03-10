package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class DireccionMinimarketActualizado extends DomainEvent {

    private final MiniMarket miniMarket;

    public DireccionMinimarketActualizado(MiniMarket miniMarket) {
        super("sofka.ordenPedido.DireccionMinimarketActualizado");
        this.miniMarket = miniMarket;
    }

    public MiniMarket getMiniMarket() {
        return miniMarket;
    }
}
