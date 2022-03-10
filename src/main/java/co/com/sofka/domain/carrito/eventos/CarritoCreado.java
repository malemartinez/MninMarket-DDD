package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class CarritoCreado extends DomainEvent {

    private final Cliente cliente;
    private final Cajero cajero;

    public CarritoCreado(Cajero cajero,Cliente cliente ) {
        super("sofka.Carrito.CarritoCreado");
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }
}
