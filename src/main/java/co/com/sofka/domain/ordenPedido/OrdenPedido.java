package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.NombreClienteActualizado;
import co.com.sofka.domain.carrito.ProductoAgregago;
import co.com.sofka.domain.carrito.ProductoEliminado;
import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.ordenPedido.valor.Fecha;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

import java.util.List;
import java.util.Objects;

public class OrdenPedido extends AggregateEvent<OrdenID> {

    protected Fecha fecha;
    protected MiniMarket miniMarket;
    protected Proveedor proveedor;
    protected List<Producto> productosPedido;

    public OrdenPedido(OrdenID entityId, Fecha fecha, MiniMarket miniMarket, Proveedor proveedor, List<Producto> productosPedido) {
        super(entityId);
        this.fecha = fecha;
        this.miniMarket = miniMarket;
        this.proveedor = proveedor;
        this.productosPedido = productosPedido;
    }

    public OrdenPedido(OrdenID entityId) {
        super(entityId);
    }
    

}
