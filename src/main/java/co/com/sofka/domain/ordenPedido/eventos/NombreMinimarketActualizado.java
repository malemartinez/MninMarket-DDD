package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class NombreMinimarketActualizado extends DomainEvent {

    private final TiendaId tiendaId;
    private final Nombre nombre;

    public NombreMinimarketActualizado(TiendaId tiendaId, Nombre nombre) {
        super("sofka.ordenPedido.NombreMinimarketActualizado");
        this.tiendaId = tiendaId;
        this.nombre = nombre;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
