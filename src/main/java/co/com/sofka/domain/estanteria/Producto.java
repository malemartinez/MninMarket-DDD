package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.estanteria.valor.Descripcion;
import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.Precio;
import co.com.sofka.domain.estanteria.valor.ProductoId;
import co.com.sofka.domain.generic.Entity;


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

    private Producto(ProductoId productoId){
        super(productoId);
    }

    public static Producto from(ProductoId productoId, Precio precio, Nombre nombre, Descripcion descripcion){
        Producto nuevoProducto = new Producto(productoId);
        nuevoProducto.precio = precio;
        nuevoProducto.nombre = nombre;
        nuevoProducto.descripcion = descripcion;
        return nuevoProducto;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarPrecio(Precio nuevoPrecio){
        this.precio = Objects.requireNonNull(nuevoPrecio);
    }

    public void actualizarDescripcion(Descripcion nuevaDescripcion){
        this.descripcion = Objects.requireNonNull(nuevaDescripcion);
    }

    public ProductoId productoId() {
        return productoId;
    }

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
