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
    private final MiniMarket miniMarket;
    private final List<Producto> productos;
    private final Proveedor proveedor;

    public OrdenPedidoCreado(OrdenID entityId, Fecha fecha, MiniMarket miniMarket, List<Producto> productos, Proveedor proveedor) {
        super("sofka.ordenPedido.OrdenPedidoCreado");
        this.fecha = fecha;
        this.miniMarket = miniMarket;
        this.productos = productos;
        this.proveedor = proveedor;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public MiniMarket getMiniMarket() {
        return miniMarket;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}
