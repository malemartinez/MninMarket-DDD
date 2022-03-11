package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreSurtidorActualizado extends DomainEvent {

    private final Surtidor surtidor;

    public NombreSurtidorActualizado(Surtidor surtidor) {
        super("sofka.estanteria.NombreSurtidorActualizado");
        this.surtidor = surtidor;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }
}
