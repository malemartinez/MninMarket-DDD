package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class TelefonoMinimarketActualizado extends DomainEvent {
    public TelefonoMinimarketActualizado(MiniMarket miniMarket) {
        super("TelefonoMinimarketActualizado");
    }
}
