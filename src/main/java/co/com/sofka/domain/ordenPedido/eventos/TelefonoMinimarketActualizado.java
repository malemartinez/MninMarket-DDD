package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class TelefonoMinimarketActualizado extends DomainEvent {

    private final MiniMarket miniMarket;

    public TelefonoMinimarketActualizado(MiniMarket miniMarket) {
        super("sofka.ordenPedido.TelefonoMinimarketActualizado");
        this.miniMarket = miniMarket;
    }

    public MiniMarket getMiniMarket() {
        return miniMarket;
    }
}
