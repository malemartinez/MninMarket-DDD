package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.Direccion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Telefono;
import co.com.sofka.domain.ordenPedido.valor.TiendaId;

import java.util.Objects;

public class MiniMarket extends Identity {

    private TiendaId tiendaId;
    private Nombre nombre;
    private Telefono telefono;
    private Direccion direccion;

    public void actualizarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void actualizarTelefono(Telefono nuevoTelefono){
        this.telefono = Objects.requireNonNull(nuevoTelefono);
    }

    public void actualizarDireccion(Direccion nuevaDireccion){
        this.direccion = Objects.requireNonNull(nuevaDireccion);
    }
}
