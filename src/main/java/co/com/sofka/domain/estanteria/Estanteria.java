package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.estanteria.eventos.*;
import co.com.sofka.domain.estanteria.valor.*;
import co.com.sofka.domain.generic.AggregateEvent;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Estanteria extends AggregateEvent<EstanteriaId> {

    protected List<Producto> productos;
    protected Surtidor surtidor;

    public Estanteria(EstanteriaId entityId, List<Producto> productos, Surtidor surtidor) {
        super(entityId);
        this.productos = productos;
        this.surtidor = surtidor;
    }

    public void actualizarNombreSurtidor(Cliente cliente){
        Objects.requireNonNull(cliente);
        appendChange(new NombreSurtidorActualizado(cliente)).apply();
    }

    public void actualizarTelefonoSurtidor(Cliente cliente){
        Objects.requireNonNull(cliente);
        appendChange(new TelefonoSurtidorActualizado(cliente)).apply();
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

    public void actualizarPrecioProducto(ProductoId productoId , Precio nuevoPrecio){
        appendChange(new PrecioProductoActualizado(productoId , nuevoPrecio)).apply();
    }

    public Optional<Producto> getProductoporID(ProductoId productoId){
        return productos.stream()
                .filter( item -> item.getProductoId().equals(productoId)).findFirst();
    }
}
