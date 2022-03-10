package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class DireccionMinimarketActualizado extends DomainEvent {
    public DireccionMinimarketActualizado(MiniMarket miniMarket) {
        super("DireccionMinimarketActualizado");
    }
}
