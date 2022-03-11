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
            var surtidor = estanteria.surtidor;
            surtidor.actualizarNombre(event.getSurtidor().getNombre());
            estanteria.surtidor = surtidor;

        });

        apply((PrecioProductoActualizado event)->{
            var productoFiltado = estanteria.getProductoporId(event.getProductoId()).orElseThrow(
                    ()-> new IllegalArgumentException("Producto no encontrado"));
            productoFiltado.actualizarPrecio(event.getPrecio());
        });

        apply((PrecioProductoActualizado event) -> {
            var productoFiltado = estanteria.getProductoporId(event.getProductoId())
                    .orElseThrow(()-> new IllegalArgumentException("Producto no encontrado"));
            productoFiltado.actualizarPrecio(event.getPrecio());
        });

        apply((ProductoAgregago event)-> {
            var NuevoProducto = new Producto(event.getEntityId(),event.getPrecio(),event.getNombre(),event.getDescripcion());
            estanteria.productos.add(NuevoProducto);

        });

        apply((ProductoEliminado event)->{
            var producto = estanteria.getProductoporId(event.getEntityId()).orElseThrow(
                    ()-> new IllegalArgumentException("Producto no encontrado"));
            estanteria.productos.remove(producto);
        } );

        apply((TelefonoSurtidorActualizado event) ->{
            var surtidor = estanteria.surtidor;
            surtidor.actualizarTelefono(event.getSurtidor().getTelefono());
        });
    }
}
