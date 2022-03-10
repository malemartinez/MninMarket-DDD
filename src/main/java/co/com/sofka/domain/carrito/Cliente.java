package co.com.sofka.domain.carrito;

import co.com.sofka.domain.carrito.valor.clienteID;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<clienteID> {


    public Cliente(clienteID entityId) {
        super(entityId);
    }
}