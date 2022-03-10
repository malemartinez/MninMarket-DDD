package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;
import co.com.sofka.domain.ordenPedido.valor.Telefono;

public class Proveedor extends Identity {

    private ProveedorId proveedorId;
    private Nombre nombre;
    private Telefono telefono;

}
