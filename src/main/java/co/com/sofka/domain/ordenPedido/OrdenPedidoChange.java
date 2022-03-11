package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.ordenPedido.eventos.*;

import java.util.ArrayList;

public class OrdenPedidoChange extends EventChange {

    public OrdenPedidoChange(OrdenPedido ordenPedido) {

        apply((OrdenPedidoCreado event) -> {
            ordenPedido.fecha = event.getFecha();
            ordenPedido.miniMarket = event.getMiniMarket();
            ordenPedido.productos = new ArrayList<>();
            ordenPedido.proveedor = event.getProveedor();
        });

        apply((DireccionMinimarketActualizado event) -> {
            ordenPedido.miniMarket = event.getMiniMarket();
        });

        apply((NombreMinimarketActualizado event) -> {
            ordenPedido.miniMarket = event.getMiniMarket();
        });

        apply((NombreProveedorActualizado event) -> {
            ordenPedido.proveedor = event.getProveedor();
        });

        apply((PrecioProductoActualizado event) ->{
            var productoFiltado = ordenPedido.getProductoporID(event.getProductoId()).orElseThrow();
            productoFiltado.actualizarPrecio(event.getPrecio());
        });

        apply((ProductoAgregado event) -> {

        });

        apply((ProductoEliminado event) -> {

        });

        apply((TelefonoMinimarketActualizado event) -> {
            ordenPedido.miniMarket = event.getMiniMarket();
        });

        apply((TelefonoProveedorActualizado event) ->{
            ordenPedido.proveedor = event.getProveedor();
        });
    }
}
