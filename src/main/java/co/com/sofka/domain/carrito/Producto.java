package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

import java.util.Objects;

public class Producto extends Entity<productoID> {

        private ProductoId productoId;
        private Nombre nombre;
        private Descripcion descripcion;
        private Precio precio;

        public Producto(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
                super(entityId);
                this.nombre = nombre;
                this.descripcion = descripcion;
                this.precio = precio;
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


        public Nombre getNombre() {
                return nombre;
        }

        public Descripcion getDescripcion() {
                return descripcion;
        }

        public Precio getPrecio() {
                return precio;
        }

        public ProductoId getProductoId() {
                return productoId;
        }
}
