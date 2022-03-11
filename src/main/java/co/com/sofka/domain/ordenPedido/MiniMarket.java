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

    protected MiniMarket(TiendaId tiendaId, Nombre nombre, Telefono telefono, Direccion direccion) {
        super(tiendaId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    private MiniMarket(TiendaId tiendaId){
        super(tiendaId);
    }

    public static MiniMarket from(TiendaId tiendaId, Nombre nombre, Telefono telefono, Direccion direccion){
        var nuevoMiniMarket = new MiniMarket(tiendaId);
        nuevoMiniMarket.nombre = nombre;
        nuevoMiniMarket.telefono = telefono;
        nuevoMiniMarket.direccion = direccion;
        return nuevoMiniMarket;
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

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Direccion direccion() {
        return direccion;
    }
}
