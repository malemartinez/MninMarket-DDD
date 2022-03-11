package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.eventos.*;
import co.com.sofka.domain.ordenPedido.valor.*;


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

    private OrdenPedido(OrdenID entityId){
        super(entityId);
        subscribe(new OrdenPedidoChange(this));
    }

    public static OrdenPedido from(OrdenID entityId, List<DomainEvent> events) {
        var OrdenPedido = new OrdenPedido(entityId);
        events.forEach(OrdenPedido::applyEvent);
        return OrdenPedido;
    }



    public void agregarProducto(ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        var NuevoProducto = new Producto(entityId,precio,nombre,descripcion);
        productos.add(NuevoProducto);
        appendChange(new ProductoAgregado(entityId, nombre, descripcion, precio)).apply();
    }

    public void eliminarProducto(ProductoId entityId){
        Objects.requireNonNull(entityId);
        productos.remove(this.getProductoporID(entityId).get());
        appendChange(new ProductoEliminado(entityId)).apply();
    }

    public void actualizarNombreProveedor(){
        Objects.requireNonNull(proveedor);
        appendChange(new NombreProveedorActualizado(proveedor)).apply();
    }

    public void actualizarTelefonoProveedor(){
        Objects.requireNonNull(proveedor);
        appendChange(new TelefonoProveedorActualizado(proveedor)).apply();
    }

    public void actualizarNombreMinimarket(){
        Objects.requireNonNull(miniMarket);
        appendChange(new NombreMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarTelefonoMinimarket(){
        Objects.requireNonNull(miniMarket);
        appendChange(new TelefonoMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarDireccionMinimarket(){
        Objects.requireNonNull(miniMarket);
        appendChange(new DireccionMinimarketActualizado(miniMarket)).apply();
    }

    public void actualizarPrecioProducto(ProductoId productoId , Precio precio){
       appendChange(new PrecioProductoActualizado(productoId , precio)).apply();
    }

    protected Optional<Producto> getProductoporID(ProductoId productoId){
        return productos.stream()
                .filter( item -> item.identity().equals(productoId)).findFirst();
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
