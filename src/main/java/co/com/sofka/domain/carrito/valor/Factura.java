package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Factura implements ValueObject<FacturaID> {

    private final ClienteID clienteID;
    private final CajeroID cajeroID;
    private final Total pago;
    private final MetodoPago metodoPago;

    public Factura(ClienteID clienteID, CajeroID cajeroID, Total pago, MetodoPago metodoPago) {
        this.clienteID = clienteID;
        this.cajeroID = cajeroID;
        this.pago = pago;
        this.metodoPago = metodoPago;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public FacturaID value() {

        return null;
    }
}
