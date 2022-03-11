package co.com.sofka.domain.estanteria.comandos;

import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreSurtidor extends Command {

    private final EstanteriaId id;
    private final Surtidor surtidor;

    public actualizarNombreSurtidor(EstanteriaId id, Surtidor surtidor) {
        this.id = id;
        this.surtidor = surtidor;
    }

    public EstanteriaId getId() {
        return id;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }
}
