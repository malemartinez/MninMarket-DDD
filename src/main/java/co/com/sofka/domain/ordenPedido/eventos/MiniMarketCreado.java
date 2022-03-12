package co.com.sofka.domain.ordenPedido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ordenPedido.valor.Direccion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

public class MiniMarketCreado extends DomainEvent {

    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Direccion direccion;

    public MiniMarketCreado(TiendaId tiendaId, Nombre nombre, Telefono telefono, Direccion direccion) {
        super("sofka.ordenPedido.MiniMarketCreado");
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
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
