package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.Command;

public class CalcularTotal extends Command {

    private final CarritoID carritoID;
    private final Total total;

    public CalcularTotal(CarritoID carritoID, Total total) {
        this.carritoID = carritoID;
        this.total = total;
    }

    public CarritoID getCarritoID() {
        return carritoID;
    }

    public Total getTotal() {
        return total;
    }
}
