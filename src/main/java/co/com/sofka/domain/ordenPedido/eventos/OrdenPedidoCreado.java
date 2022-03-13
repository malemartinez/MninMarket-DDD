package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.MiniMarket;
import co.com.sofka.domain.ordenPedido.Producto;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.Fecha;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

import java.util.List;

public class OrdenPedidoCreado extends DomainEvent {

    private final Fecha fecha;
    private final OrdenID ordenID;
    public OrdenPedidoCreado(OrdenID entityId, Fecha fecha) {
        super("sofka.ordenPedido.OrdenPedidoCreado");
        this.fecha = fecha;
        this.ordenID = entityId;

    }

    public Fecha getFecha() {
        return fecha;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }
}
