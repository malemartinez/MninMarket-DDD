package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Total;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CrearCarrito extends Command {

    private final CarritoID entityId;
    private final Total total;


    public CrearCarrito(CarritoID entityId , Total total) {
        this.entityId = entityId;
        this.total = total;

    }

    public CarritoID getEntityId() {
        return entityId;
    }

    public Total getTotal() {
        return total;
    }
}
