package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreSurtidorActualizado extends DomainEvent {

    private final SurtidorId surtidorId;
    private final Nombre nombre;

    public NombreSurtidorActualizado(SurtidorId surtidorId, Nombre nombre) {
        super("sofka.estanteria.NombreSurtidorActualizado");
        this.surtidorId = surtidorId;
        this.nombre = nombre;
    }

    public SurtidorId getSurtidorId() {
        return surtidorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
