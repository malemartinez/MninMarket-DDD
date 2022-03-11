package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.estanteria.eventos.EstanteriaCreada;
import co.com.sofka.domain.estanteria.eventos.NombreSurtidorActualizado;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class EstanteriaChange extends EventChange {

    public EstanteriaChange(Estanteria estanteria){

        apply((EstanteriaCreada event) ->{
            estanteria.productos = new ArrayList<>();
            estanteria.surtidor = event.getSurtidor();
        });

        apply((NombreSurtidorActualizado event) ->{
            estanteria.surtidor = event.getSurtidor();
        });
    }
}
