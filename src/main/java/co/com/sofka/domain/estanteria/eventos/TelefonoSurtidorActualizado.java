package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoSurtidorActualizado extends DomainEvent {

    private final Surtidor surtidor;

    public TelefonoSurtidorActualizado(Surtidor surtidor) {
        super("sofka.estanteria.TelefonoSurtidorActualizado");
        this.surtidor = surtidor;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }
}
