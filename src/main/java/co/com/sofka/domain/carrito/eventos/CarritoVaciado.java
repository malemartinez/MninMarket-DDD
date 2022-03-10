package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CarritoVaciado extends DomainEvent {
    private final List<Producto> productos;

    public CarritoVaciado(List<Producto> productos) {
        super("sofka.Carrito.CarritoVaciado");
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
