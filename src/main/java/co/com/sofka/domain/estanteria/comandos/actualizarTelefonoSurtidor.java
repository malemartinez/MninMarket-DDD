package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.Entity;

public class actualizarTelefonoSurtidor extends Command {

    private final EstanteriaId id;

    private final Telefono telefono;

    public actualizarTelefonoSurtidor(EstanteriaId id, Telefono telefono) {
        this.id = id;

        this.telefono = telefono;
    }

    public EstanteriaId getId() {
        return id;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
