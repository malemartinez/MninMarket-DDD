package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.carrito.Carrito;
import co.com.sofka.domain.carrito.eventos.MetodoPagoElegido;
import co.com.sofka.domain.carrito.valor.CarritoID;
import co.com.sofka.domain.carrito.valor.MetodoPago;
import co.com.sofka.domain.carrito.valor.Total;

public class DescuentoPorMetodoDePagoEventUseCase extends UseCase<TriggeredEvent<MetodoPagoElegido>, ResponseEvents> {

    private static final double descuento = 0.030;

    @Override
    public void executeUseCase(TriggeredEvent<MetodoPagoElegido> metodoPagoElegidoTriggeredEvent) {
        var event = metodoPagoElegidoTriggeredEvent.getDomainEvent();

        var carrito = Carrito.from( event.getCarritoID() ,retrieveEvents());
        carrito.elegirMetodoPago(event.getCarritoID(),event.getMetodoPago());
        if (carrito.metodoPago().value().equals(MetodoPago.Pago.EFECTIVO)) {

            var totalCompra = carrito.total().value();
            var totalConDescuento = totalCompra - (totalCompra * descuento);
            carrito.asignarTotalConDescuento(new Total(totalConDescuento));
            emit().onResponse(new ResponseEvents(carrito.getUncommittedChanges()));
        }
    }}

