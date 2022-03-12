package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class TelefonoMinimarketActualizado extends DomainEvent {

    private final TiendaId tiendaId;
    private final Telefono telefono;

    public TelefonoMinimarketActualizado(TiendaId tiendaId, Telefono telefono) {
        super("sofka.ordenPedido.TelefonoMinimarketActualizado");
        this.tiendaId = tiendaId;
        this.telefono = telefono;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
