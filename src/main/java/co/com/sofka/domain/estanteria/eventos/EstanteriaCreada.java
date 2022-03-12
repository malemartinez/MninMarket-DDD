package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.estanteria.Producto;
import co.com.sofka.domain.estanteria.Surtidor;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class EstanteriaCreada extends DomainEvent {


    public EstanteriaCreada(EstanteriaId entityId) {
        super("sofka.estanteria.EstanteriaCreada");

    }

}
