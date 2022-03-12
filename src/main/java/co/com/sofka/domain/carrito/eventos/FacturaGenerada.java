package co.com.sofka.domain.carrito.eventos;

import co.com.sofka.domain.carrito.valor.CajeroID;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.MetodoPago;

import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaGenerada extends DomainEvent {

    private final ClienteID clienteID;
    private final CajeroID cajeroID;
    private final Total pago;
    private final MetodoPago metodoPago;

    public FacturaGenerada(ClienteID clienteID, CajeroID cajeroID, Total pago, MetodoPago metodoPago) {
        super("sofka.carrito.FacturaGenerada");
        this.clienteID = clienteID;
        this.cajeroID = cajeroID;
        this.pago = pago;
        this.metodoPago = metodoPago;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public CajeroID getCajeroID() {
        return cajeroID;
    }

    public Total getPago() {
        return pago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
