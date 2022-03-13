package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoSurtidorActualizado extends DomainEvent {


    private final Telefono telefono;

    public TelefonoSurtidorActualizado(Telefono telefono) {
        super("sofka.estanteria.TelefonoSurtidorActualizado");

        this.telefono = telefono;
    }


    public Telefono telefono() {
        return telefono;
    }
}
