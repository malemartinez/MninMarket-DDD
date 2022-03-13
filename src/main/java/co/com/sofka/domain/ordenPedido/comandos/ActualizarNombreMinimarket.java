package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class ActualizarNombreMinimarket extends Command {

    private final OrdenID ordenID;
    private final Nombre nombre;

    public ActualizarNombreMinimarket(OrdenID ordenID, Nombre nombre) {
        this.ordenID = ordenID;
        this.nombre = nombre;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
