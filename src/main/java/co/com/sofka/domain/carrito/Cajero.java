package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.carrito.valor.Telefono;
import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cajero extends Entity<CajeroID> {

    private Nombre nombre;
    private Telefono telefono;

    protected Cajero(CajeroID entityId, Nombre nombre, Telefono telefono ) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    private Cajero ( CajeroID entityId){
        super(entityId);
    }

    public static Cajero from(CajeroID entityId, Nombre nombre, Telefono telefono){
        var nuevoCajero = new Cajero(entityId);
        nuevoCajero.nombre = nombre;
        nuevoCajero.telefono = telefono;
        return nuevoCajero;

    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono) ;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }


}
