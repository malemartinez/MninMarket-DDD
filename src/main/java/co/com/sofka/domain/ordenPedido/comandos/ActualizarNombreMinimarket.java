package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class ActualizarNombreMinimarket extends Command {

    private final OrdenID ordenID;
    private final TiendaId tiendaId;
    private final Nombre nombre;

    public ActualizarNombreMinimarket(OrdenID ordenID, TiendaId tiendaId, Nombre nombre) {
        this.ordenID = ordenID;
        this.tiendaId = tiendaId;
        this.nombre = nombre;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
