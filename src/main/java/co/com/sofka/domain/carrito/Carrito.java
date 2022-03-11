package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.eventos.*;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.carrito.valor.ProductoID;
import co.com.sofka.domain.carrito.eventos.ClienteCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Carrito extends AggregateEvent<CarritoID> {

    protected Cajero cajero;
    protected Cliente cliente;
    protected List<Producto> productos;
    protected Factura factura;
    protected MetodoPago metodoPago;

    public Carrito(CarritoID entityId,List<Producto> productos ) {
        super(entityId);
        appendChange(new CarritoCreado(entityId)).apply();
    }

    private Carrito(CarritoID entityId) {
        super(entityId);
        subscribe(new CarritoChange(this));

    }
    public static Carrito from(CarritoID entityId, List<DomainEvent> events) {
        var carrito = new Carrito(entityId);
        events.forEach(carrito::applyEvent);
        return carrito;
    }

    //Crear cliente
    public void crearCliente(ClienteID id, Nombre nombre, Telefono telefono){
        appendChange(new ClienteCreado(id, nombre,telefono )).apply();
    }
    //crear Cajero
    public void crearCajero(CajeroID id, Nombre nombre, Telefono telefono){
        appendChange(new CajeroCreado(id, nombre,telefono )).apply();
    }


    public void agregarProducto(ProductoID entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);

        appendChange(new ProductoAgregago(entityId, nombre, descripcion, precio)).apply();

    }

    public void eliminarProducto(ProductoID entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoEliminado(entityId)).apply();
    }

    public void vaciarCarrito(){
        appendChange(new CarritoVaciado()).apply();
    }

    public void generarFactura(ClienteID clienteID, CajeroID cajeroID, Total pago, MetodoPago metodoPago){
        Objects.requireNonNull(clienteID);
        Objects.requireNonNull(cajeroID);
        Objects.requireNonNull(pago);
        Objects.requireNonNull(metodoPago);
        appendChange(new FacturaGenerada(clienteID,cajeroID,pago,metodoPago)).apply();
    }

    public void actualizarNombreCliente(ClienteID id, Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreClienteActualizado(id, nombre)).apply();
    }

    public void actualizarTelefonoCliente(ClienteID id, Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoClienteActualizado(id, telefono)).apply();
    }

    public void actualizarNombreCajero(CajeroID id, Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreCajeroActualizado(id, nombre)).apply();
    }

    public void actualizarTelefonoCajero(CajeroID id, Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoCajeroActualizado(id, telefono)).apply();
    }

    protected Optional<Producto> getProductoPorID(ProductoID productoId){
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
