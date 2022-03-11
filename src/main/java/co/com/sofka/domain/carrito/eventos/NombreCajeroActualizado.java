package co.com.sofka.domain.carrito.eventos;


import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCajeroActualizado extends DomainEvent {

    private final CajeroID cajeroID;
    private  final Nombre nombre;

    public NombreCajeroActualizado(CajeroID cajeroID,Nombre nombre) {
        super("sofka.Carrito.NombreCajeroActualizado");
        this.cajeroID = cajeroID;
        this.nombre=nombre;

    }

    public CajeroID getCajeroID() {
        return cajeroID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
