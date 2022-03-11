package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Producto;
import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class EstanteriaCreada extends DomainEvent {

    private final List<Producto> productos;
    private final Surtidor surtidor;

    public EstanteriaCreada(EstanteriaId entityId, List<Producto> productos, Surtidor surtidor) {
        super("sofka.estanteria.EstanteriaCreada");
        this.productos = productos;
        this.surtidor = surtidor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }
}
