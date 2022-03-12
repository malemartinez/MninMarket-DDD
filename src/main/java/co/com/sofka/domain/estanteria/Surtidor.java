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

    protected Surtidor(SurtidorId surtidorId, Nombre nombre, Telefono telefono) {
        super(surtidorId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    private Surtidor(SurtidorId surtidorId){
        super(surtidorId);
    }

    public static Surtidor from(SurtidorId surtidorId, Nombre nombre, Telefono telefono){
        Surtidor nuevoSurtidor = new Surtidor(surtidorId);
        nuevoSurtidor.nombre = nombre;
        nuevoSurtidor.telefono = telefono;
        return nuevoSurtidor;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
    }

    public SurtidorId surtidorId() {
        return surtidorId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
