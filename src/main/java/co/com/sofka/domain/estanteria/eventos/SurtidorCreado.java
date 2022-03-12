package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class SurtidorCreado extends DomainEvent {

    private final SurtidorId surtidorId;
    private final Nombre nombre;
    private final Telefono telefono;

    public SurtidorCreado(SurtidorId surtidorId, Nombre nombre, Telefono telefono) {
        super("sofka.Estanteria.SurtidorCreado");
        this.nombre= nombre;
        this.surtidorId = surtidorId;
        this.telefono = telefono;
    }

    public SurtidorId getSurtidorId() {
        return surtidorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
