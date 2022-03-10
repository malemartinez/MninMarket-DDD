package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Surtidor extends Entity<SurtidorId> {

    private SurtidorId surtidorId;
    private Nombre nombre;
    private Telefono telefono;

    public Surtidor(SurtidorId entityId, SurtidorId surtidorId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.surtidorId = surtidorId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
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
