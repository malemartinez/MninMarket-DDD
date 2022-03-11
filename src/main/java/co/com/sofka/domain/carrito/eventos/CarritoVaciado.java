package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CarritoVaciado extends DomainEvent {


    public CarritoVaciado() {
        super("sofka.Carrito.CarritoVaciado");

    }

}
