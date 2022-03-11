package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.estanteria.eventos.*;
import co.com.sofka.domain.estanteria.valor.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Estanteria extends AggregateEvent<EstanteriaId> {

    protected List<Producto> productos;
    protected Surtidor surtidor;

    public Estanteria(EstanteriaId entityId, List<Producto> productos, Surtidor surtidor) {
        super(entityId);
        subscribe(new EstanteriaChange(this));
        this.productos = productos;
        this.surtidor = surtidor;
    }

    private Estanteria(EstanteriaId entityId){
        super(entityId);
        subscribe(new EstanteriaChange(this));
    }

    public static Estanteria from(EstanteriaId entityId, List<DomainEvent> events) {
        var estanteria = new Estanteria(entityId);
        events.forEach(estanteria::applyEvent);
        return estanteria;
    }

    public void actualizarNombreSurtidor(Surtidor surtidor){
        Objects.requireNonNull(surtidor);
        appendChange(new NombreSurtidorActualizado(surtidor)).apply();
    }

    public void actualizarTelefonoSurtidor(Surtidor surtidor){
        Objects.requireNonNull(surtidor);
        appendChange(new TelefonoSurtidorActualizado(surtidor)).apply();
    }

    public void agregarProducto(ProductoId entityId, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregago(entityId, nombre, descripcion, precio)).apply();

    }

    public void eliminarProducto(ProductoId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoEliminado(entityId)).apply();
    }

    public void actualizarPrecioProducto(ProductoId productoId , Precio nuevoPrecio){
        appendChange(new PrecioProductoActualizado(productoId , nuevoPrecio)).apply();
    }

    public Optional<Producto> getProductoporID(ProductoId productoId){
        return productos.stream()
                .filter( item -> item.identity().equals(productoId)).findFirst();
    }
}
