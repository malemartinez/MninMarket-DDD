package co.com.sofka.domain.carrito.eventos;


import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCajeroActualizado extends DomainEvent {


    private  final Nombre nombre;

    public NombreCajeroActualizado(Nombre nombre) {
        super("sofka.Carrito.NombreCajeroActualizado");

        this.nombre=nombre;

    }



    public Nombre getNombre() {
        return nombre;
    }
}
