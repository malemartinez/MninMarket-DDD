package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.carrito.eventos.ClienteCreado;
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

    public OrdenPedido(OrdenID entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
        subscribe(new OrdenPedidoChange(this));
        appendChange(new OrdenPedidoCreado(entityId,fecha));
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

    //Crear MiniMarket
    public  void crearMiniMarket(TiendaId tiendaId, Nombre nombre, Telefono telefono, Direccion direccion){
        appendChange(new MiniMarketCreado(tiendaId, nombre, telefono, direccion )).apply();
    }

    //Crear Proveedor
    public void crearProveedor(ProveedorId proveedorId, Nombre nombre, Telefono telefono){
        appendChange(new ProveedorCreado(proveedorId, nombre, telefono)).apply();
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

    public void actualizarNombreProveedor( Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreProveedorActualizado( nombre)).apply();
    }

    public void actualizarTelefonoProveedor(ProveedorId proveedorId, Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoProveedorActualizado(proveedorId, telefono)).apply();
    }

    public void actualizarNombreMinimarket(TiendaId tiendaId, Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreMinimarketActualizado(tiendaId, nombre)).apply();
    }

    public void actualizarTelefonoMinimarket(TiendaId tiendaId, Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoMinimarketActualizado(tiendaId, telefono)).apply();
    }

    public void actualizarDireccionMinimarket(TiendaId tiendaId, Direccion direccion){
        Objects.requireNonNull(direccion);
        appendChange(new DireccionMinimarketActualizado(tiendaId, direccion)).apply();
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
