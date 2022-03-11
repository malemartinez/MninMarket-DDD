package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.ordenPedido.valor.*;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {

    private ProductoId productoId;
    private Precio precio;
    private Descripcion descripcion;
    private Nombre nombre;

    protected Producto(ProductoId productoId, Precio precio, Nombre nombre, Descripcion descripcion) {
        super(productoId);
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    private Producto(ProductoId entityId){
        super(entityId);
    }

    public static Producto from(ProductoId productoId, Precio precio, Nombre nombre, Descripcion descripcion){
        var nuevoProducto = new Producto(productoId);
        nuevoProducto.nombre = nombre;
        nuevoProducto.precio = precio;
        nuevoProducto.descripcion = descripcion;
        return nuevoProducto;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarPrecio(Precio Precio){
        this.precio = Objects.requireNonNull(Precio);
    }

    public void actualizarDescripcion(Descripcion nuevaDescripcion){
        this.descripcion = Objects.requireNonNull(nuevaDescripcion);
    }

    /*public ProductoId getProductoId() {
        return productoId;
    }*/

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Nombre nombre() {
        return nombre;
    }
}
