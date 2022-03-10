package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Descripcion;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Precio;
import co.com.sofka.domain.carrito.valor.productoID;
import co.com.sofka.domain.generic.Entity;

public class Productos extends Entity<productoID> {
        private Nombre nombre;
        private Descripcion descripcion;
        private Precio precio;

        public Productos(productoID entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
                super(entityId);
                this.nombre = nombre;
                this.descripcion = descripcion;
                this.precio = precio;
        }

        public void cambiarNombre(Nombre nuevoNombre){
                this.nombre = nuevoNombre;
        }

        public void cambiarDescripcion(Descripcion descripcion){
                this.descripcion = descripcion;
        }

        public void cambiarPrecio(Precio nuevoPrecio){

                this.precio = nuevoPrecio;
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
}
