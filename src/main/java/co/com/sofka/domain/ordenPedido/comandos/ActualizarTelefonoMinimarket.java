package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class ActualizarTelefonoMinimarket extends Command {

    private final OrdenID ordenID;
    private final TiendaId tiendaId;
    private final Telefono telefono;

    public ActualizarTelefonoMinimarket(OrdenID ordenID, TiendaId tiendaId, Telefono telefono) {
        this.ordenID = ordenID;
        this.tiendaId = tiendaId;
        this.telefono = telefono;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
