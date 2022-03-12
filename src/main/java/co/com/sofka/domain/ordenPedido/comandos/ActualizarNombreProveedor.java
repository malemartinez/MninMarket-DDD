package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;
import co.com.sofka.domain.ordenPedido.valor.ProveedorId;

public class ActualizarNombreProveedor extends Command {

    private final OrdenID ordenID;
    private final ProveedorId proveedorId;
    private final Nombre nombre;

    public ActualizarNombreProveedor(OrdenID ordenID, ProveedorId proveedorId, Nombre nombre) {
        this.ordenID = ordenID;
        this.proveedorId = proveedorId;
        this.nombre = nombre;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
