package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.Direccion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

import java.util.Objects;

public class MiniMarket extends Entity<TiendaId> {

    private TiendaId tiendaId;
    private Nombre nombre;
    private Telefono telefono;
    private Direccion direccion;

    public MiniMarket(TiendaId entityId, TiendaId tiendaId, Nombre nombre, Telefono telefono, Direccion direccion) {
        super(entityId);
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
    }

    public void actualizarDireccion(Direccion nuevaDireccion){
        this.direccion = Objects.requireNonNull(nuevaDireccion);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
