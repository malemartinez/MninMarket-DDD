package co.com.sofka.domain.estanteria.eventos;

import co.com.sofka.domain.carrito.Cliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreSurtidorActualizado extends DomainEvent {

    private final Cliente cliente;

    public NombreSurtidorActualizado(Cliente cliente) {
        super("sofka.estanteria.NombreSurtidorActualizado");
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
