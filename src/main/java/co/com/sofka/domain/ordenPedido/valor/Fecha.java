package co.com.sofka.domain.ordenPedido.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;

public class Fecha implements ValueObject<LocalDateTime> {
    private final LocalDateTime fechaOrden;

    public Fecha(LocalDateTime fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    @Override
    public LocalDateTime value() {
        return null;
    }
}
