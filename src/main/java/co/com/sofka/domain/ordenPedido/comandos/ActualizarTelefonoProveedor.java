package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;
import co.com.sofka.domain.ordenPedido.valor.Telefono;

public class ActualizarTelefonoProveedor extends Command {

    private final OrdenID ordenID;
    private final ProveedorId proveedorId;
    private final Telefono telefono;

    public ActualizarTelefonoProveedor(OrdenID ordenID, ProveedorId proveedorId, Telefono telefono) {
        this.ordenID = ordenID;
        this.proveedorId = proveedorId;
        this.telefono = telefono;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
