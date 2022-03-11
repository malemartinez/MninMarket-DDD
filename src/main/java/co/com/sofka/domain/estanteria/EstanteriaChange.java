package co.com.sofka.domain.estanteria;

import co.com.sofka.domain.estanteria.eventos.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class EstanteriaChange extends EventChange {

    public EstanteriaChange(Estanteria estanteria){

        apply((EstanteriaCreada event) ->{
            estanteria.productos = new ArrayList<>();
            estanteria.surtidor = event.getSurtidor();
        });

        apply((NombreSurtidorActualizado event) ->{
            estanteria.surtidor = event.getSurtidor();
        });

        apply((PrecioProductoActualizado event) -> {
            var productoFiltado = estanteria.getProductoporId(event.getProductoId()).orElseThrow();
            productoFiltado.actualizarPrecio(event.getPrecio());
        });

        apply((ProductoAgregago event) -> {

        });

        apply((ProductoEliminado event) -> {

        });

        apply((TelefonoSurtidorActualizado event) ->{
            estanteria.surtidor = event.getSurtidor();
        });
    }
}
