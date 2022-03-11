package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.*;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Carrito extends AggregateEvent<carritoID> {
    protected Cajero cajero;
    protected Cliente cliente;
    protected List<Producto> productos;
    protected Factura factura;
    protected MetodoPago metodoPago;

    public Carrito(carritoID entityId, Cajero cajero, Cliente cliente,List<Producto> productos) {
        super(entityId);
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
        appendChange(new CarritoCreado(cajero,cliente)).apply();
    }

    private Carrito(carritoID entityId) {
        super(entityId);
        subscribe(new CarritoChange(this));

    }
    public static Carrito from(carritoID entityId, List<DomainEvent> events) {
        var carrito = new Carrito(entityId);
        events.forEach(carrito::applyEvent);
        return carrito;
    }



    public void agregarProducto(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);

        appendChange(new ProductoAgregago(entityId, nombre, descripcion, precio)).apply();

    }

    public void eliminarProducto(Producto producto){
        Objects.requireNonNull(producto);
        appendChange(new ProductoEliminado(producto.identity())).apply();
    }

    public void vaciarCarrito(){
        appendChange(new CarritoVaciado()).apply();
    }

    public void generarFactura(Cajero cajero, Cliente cliente, List<Producto> productos, MetodoPago metodoPago){
        Objects.requireNonNull(cajero);
        Objects.requireNonNull(cliente);
        Objects.requireNonNull(productos);
        Objects.requireNonNull(metodoPago);
        appendChange(new FacturaGenerada(cajero,cliente,productos,metodoPago)).apply();
    }

    public void actualizarNombreCliente(Cliente cliente){
        Objects.requireNonNull(cliente);
        appendChange(new NombreClienteActualizado(cliente)).apply();
    }

    public void actualizarTelefonoCliente(Cliente cliente){
        Objects.requireNonNull(cliente);
        appendChange(new TelefonoClienteActualizado(cliente)).apply();
    }

    public void actualizarNombreCajero(Cajero cajero){
        Objects.requireNonNull(cajero);
        appendChange(new NombreCajeroActualizado(cajero)).apply();
    }

    public void actualizarTelefonoCajero(Cajero cajero){
        Objects.requireNonNull(cajero);
        appendChange(new TelefonoCajeroActualizado(cajero)).apply();
    }

    protected Optional<Producto> getProductoPorID(productoID productoId){
        return productos.stream()
                .filter( item -> item.identity().equals(productoId)).findFirst();
    }

    public Cajero Cajero() {
        return cajero;
    }

    public Cliente Cliente() {
        return cliente;
    }

    public List<Producto> Productos() {
        return productos;
    }

    public Factura Factura() {
        return factura;
    }

    public MetodoPago MetodoPago() {
        return metodoPago;
    }
}
