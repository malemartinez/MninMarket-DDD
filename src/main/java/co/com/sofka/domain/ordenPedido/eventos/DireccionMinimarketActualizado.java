package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Direccion;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class DireccionMinimarketActualizado extends DomainEvent {

    private final TiendaId tiendaId;
    private final Direccion direccion;

    public DireccionMinimarketActualizado(TiendaId tiendaId, Direccion direccion) {
        super("sofka.ordenPedido.DireccionMinimarketActualizado");
        this.tiendaId = tiendaId;
        this.direccion = direccion;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
