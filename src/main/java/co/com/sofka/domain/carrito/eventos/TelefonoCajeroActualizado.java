package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.Cajero;
import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCajeroActualizado extends DomainEvent {

    private final CajeroID cajeroID;
    private final Telefono telefono;
    public TelefonoCajeroActualizado(CajeroID cajeroID,Telefono telefono) {
        super("TelefonoCajeroActualizado");
        this.cajeroID= cajeroID;
        this.telefono = telefono;
    }

    public CajeroID getCajeroID() {
        return cajeroID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
