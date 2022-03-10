package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;

public class NombreMinimarketActualizado extends DomainEvent {
    public NombreMinimarketActualizado(MiniMarket miniMarket) {
        super("NombreMinimarketActualizado");
    }
}
