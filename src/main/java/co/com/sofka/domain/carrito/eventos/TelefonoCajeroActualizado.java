package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCajeroActualizado extends DomainEvent {


    private final Telefono telefono;
    public TelefonoCajeroActualizado(Telefono telefono) {
        super("TelefonoCajeroActualizado");

        this.telefono = telefono;
    }



    public Telefono getTelefono() {
        return telefono;
    }
}
