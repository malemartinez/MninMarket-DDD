package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.valor.Direccion;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class ActualizarDireccionMinimarket extends Command {

    private final OrdenID ordenID;
    private final Direccion direccion;

    public ActualizarDireccionMinimarket(OrdenID ordenID, Direccion direccion) {
        this.ordenID = ordenID;
        this.direccion = direccion;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
