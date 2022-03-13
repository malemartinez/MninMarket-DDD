package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class ActualizarTelefonoMinimarket extends Command {

    private final OrdenID ordenID;
    private final Telefono telefono;

    public ActualizarTelefonoMinimarket(OrdenID ordenID, Telefono telefono) {
        this.ordenID = ordenID;
        this.telefono = telefono;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
