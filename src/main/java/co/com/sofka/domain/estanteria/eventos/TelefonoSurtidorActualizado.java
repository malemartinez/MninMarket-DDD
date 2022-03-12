package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoSurtidorActualizado extends DomainEvent {

    private final SurtidorId surtidorId;
    private final Telefono telefono;

    public TelefonoSurtidorActualizado(SurtidorId surtidorId, Telefono telefono) {
        super("sofka.estanteria.TelefonoSurtidorActualizado");
        this.surtidorId = surtidorId;
        this.telefono = telefono;
    }

    public SurtidorId getSurtidorId() {
        return surtidorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
