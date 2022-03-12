package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {

    private  final Nombre nombre;

    public NombreClienteActualizado( Nombre nombre) {
        super("sofka.Carrito.NombreClienteActualizado");

        this.nombre = nombre;
    }



    public Nombre getNombre() {
        return nombre;
    }
}
