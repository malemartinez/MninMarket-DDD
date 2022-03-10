package co.com.sofka.domain.ordenPedido;
import co.com.sofka.domain.carrito.eventos.*;
import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofka.domain.ordenPedido.eventos.*;
import co.com.sofka.domain.ordenPedido.valor.Fecha;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;


import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class OrdenPedido extends AggregateEvent<OrdenID> {

    protected Fecha fecha;
    protected MiniMarket miniMarket;
    protected List<Producto> productos;
    protected Proveedor proveedor;

    public OrdenPedido(OrdenID entityId, Fecha fecha, MiniMarket miniMarket, List<Producto> productos, Proveedor proveedor) {
        super(entityId);
        this.fecha = fecha;
        this.miniMarket = miniMarket;
        this.productos = productos;
        this.proveedor = proveedor;
    }

    public void agregarProducto(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregago(entityId, nombre, descripcion, precio)).apply();

    }

    public void eliminarProducto(productoID entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoEliminado(entityId)).apply();
    }

    public void actualizarNombreProveedor(Proveedor proveedor){
        Objects.requireNonNull(proveedor);
        appendChange(new NombreProveedorActualizado(proveedor)).apply();
    }

    public void actualizarTelefonoProveedor(Proveedor proveedor){
        Objects.requireNonNull(proveedor);
        appendChange(new TelefonoProveedorActualizado(proveedor)).apply();
    }

    public void actualizarNombreMinimarket(MiniMarket miniMarket){
        Objects.requireNonNull(miniMarket);
        appendChange(new NombreMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarTelefonoMinimarket(MiniMarket miniMarket){
        Objects.requireNonNull(miniMarket);
        appendChange(new TelefonoMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarDireccionMinimarket(MiniMarket miniMarket){
        Objects.requireNonNull(miniMarket);
        appendChange(new DireccionMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarPrecioProducto(ProductoId productoId , Precio nuevoPrecio){
       appendChange(new PrecioProductoActualizado(productoId , nuevoPrecio)).apply();
    }

    public Optional<Producto> getProductoporID(ProductoId productoId){
        return productos.stream()
                .filter( item -> item.getProductoId().equals(productoId)).findFirst();
    }

    public Fecha Fecha() {
        return fecha;
    }

    public MiniMarket MiniMarket() {
        return miniMarket;
    }

    public List<Producto> Productos() {
        return productos;
    }

    public Proveedor Proveedor() {
        return proveedor;
    }
}
