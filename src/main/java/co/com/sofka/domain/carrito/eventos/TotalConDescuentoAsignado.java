package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalConDescuentoAsignado extends DomainEvent {

    private final Total total;

    public TotalConDescuentoAsignado(Total total) {
        super("sofka.carrito.TotalConDescuentoAsignado");
        this.total = total;
    }

    public Total getTotal() {
        return total;
    }
}
