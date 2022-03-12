package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreSurtidor extends Command {

    private final EstanteriaId id;
    private final SurtidorId surtidorId;
    private final Nombre nombre;

    public actualizarNombreSurtidor(EstanteriaId id, SurtidorId surtidorId, Nombre nombre) {
        this.id = id;
        this.surtidorId = surtidorId;
        this.nombre = nombre;
    }

    public EstanteriaId getId() {
        return id;
    }

    public SurtidorId getSurtidorId() {
        return surtidorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
