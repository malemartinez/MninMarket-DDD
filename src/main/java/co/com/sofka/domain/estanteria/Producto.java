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

    public Producto(ProductoId entityId, Precio precio, Nombre nombre, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
