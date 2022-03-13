package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.valor.Fecha;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

public class CrearOrdenPedido extends Command {

    private final OrdenID ordenID;
    private final Fecha fecha;

    public CrearOrdenPedido(OrdenID ordenID, Fecha fecha) {
        this.ordenID = ordenID;
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }
}
