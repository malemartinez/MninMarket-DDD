package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.ProductoID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoID> {


        private Nombre nombre;
        private Descripcion descripcion;
        private Precio precio;

        protected Producto(ProductoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
                super(entityId);
                this.nombre = nombre;
                this.descripcion = descripcion;
                this.precio = precio;
        }

        private Producto(ProductoID entityId){
                super(entityId);
        }

        public static Producto from(ProductoID entityId, Nombre nombre, Descripcion descripcion, Precio precio){
                var nuevoProducto = new Producto(entityId);
                nuevoProducto.nombre = nombre;
                nuevoProducto.precio = precio;
                nuevoProducto.descripcion=descripcion;
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


        public Nombre nombre() {
                return nombre;
        }

        public Descripcion descripcion() {
                return descripcion;
        }

        public Precio precio() {
                return precio;
        }

}
