package co.com.sofka.domain.carrito.comandos;

import co.com.sofka.domain.carrito.Producto;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CrearCarrito extends Command {

    private final CarritoID entityId;


    public CrearCarrito(CarritoID entityId) {
        this.entityId = entityId;

    }

    public CarritoID getEntityId() {
        return entityId;
    }


}
