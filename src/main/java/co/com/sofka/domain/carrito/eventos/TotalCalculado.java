package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalCalculado extends DomainEvent {

    private final Total total;

    public TotalCalculado(Total total) {
        super("sofka.carrito.TotalCalculado");
        this.total = total;
    }

    public Total getTotal() {
        return total;
    }
}
