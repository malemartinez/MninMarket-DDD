package co.com.sofka.domain.carrito.comandos;


import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCliente extends Command {

    private final CarritoID ID;
    private final ClienteID cliente;
    private final Nombre nombre;


    public ActualizarNombreCliente(CarritoID ID, ClienteID cliente, Nombre nombre) {
        this.ID = ID;
        this.cliente = cliente;
        this.nombre = nombre;
    }

    public CarritoID getID() {
        return ID;
    }

    public ClienteID getCliente() {
        return cliente;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
