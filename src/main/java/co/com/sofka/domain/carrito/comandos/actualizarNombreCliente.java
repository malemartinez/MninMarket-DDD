package co.com.sofka.domain.carrito.comandos;


import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreCliente extends Command {

    private final CarritoID ID;
    private final Cliente cliente;

    public actualizarNombreCliente(CarritoID ID, Cliente cliente) {
        this.ID = ID;
        this.cliente = cliente;
    }

    public CarritoID getID() {
        return ID;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
