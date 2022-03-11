package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.CrearCarrito;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.Total;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CrearCarritoUseCaseTest {

    @Test
    void crearCarrito(){
        //arrange
        CarritoID carritoID = new CarritoID();
        Total total = new Total(0.0);
        var command = new CrearCarrito(carritoID, total);
        var usecase = new CrearCarritoUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (CarritoCreado)events.get(0);
        Assertions.assertEquals("sofka.carrito.Carritocreado", event.type);
        Assertions.assertEquals(carritoID.value(),event.aggregateRootId());


}}