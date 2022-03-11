package co.com.sofka.domain.ordenPedido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ordenPedido.Proveedor;
import co.com.sofka.domain.ordenPedido.valor.OrdenID;

public class ActualizarTelefonoProveedor extends Command {

    private final OrdenID ordenID;
    private final Proveedor proveedor;

    public ActualizarTelefonoProveedor(OrdenID ordenID, Proveedor proveedor) {
        this.ordenID = ordenID;
        this.proveedor = proveedor;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}
