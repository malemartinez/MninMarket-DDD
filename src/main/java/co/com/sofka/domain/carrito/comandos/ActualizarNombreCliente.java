package co.com.sofka.domain.carrito.comandos;


import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.ClienteID;
import co.com.sofka.domain.carrito.valor.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCliente extends Command {

    private final CarritoID ID;

    private final Nombre nombre;


    public ActualizarNombreCliente(CarritoID ID, Nombre nombre) {
        this.ID = ID;

        this.nombre = nombre;
    }

    public CarritoID getID() {
        return ID;
    }



    public Nombre getNombre() {
        return nombre;
    }
}
