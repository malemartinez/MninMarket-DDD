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
            var miniMarket = ordenPedido.miniMarket;
            miniMarket.actualizarDireccion(event.getMiniMarket().getDireccion());
            ordenPedido.miniMarket = miniMarket;
        });

        apply((NombreMinimarketActualizado event) -> {
            var miniMarket = ordenPedido.miniMarket;
            miniMarket.actualizarNombre(event.getMiniMarket().getNombre());
            ordenPedido.miniMarket = miniMarket;
        });

        apply((NombreProveedorActualizado event) -> {
            var proveedor = ordenPedido.proveedor;
            proveedor.actualizarNombre(event.getProveedor().getNombre());
            ordenPedido.proveedor = proveedor;
        });

        apply((PrecioProductoActualizado event) ->{
            var productoFiltado = ordenPedido.getProductoporID(event.getProductoId()).orElseThrow(
                    ()-> new IllegalArgumentException("Producto no encontrado"));
            productoFiltado.actualizarPrecio(event.getPrecio());
        });

        apply((ProductoAgregado event) -> {
            ordenPedido.agregarProducto(event.getEntityId(),event.getNombre(),event.getDescripcion(),event.getPrecio());
        });

        apply((ProductoEliminado event) -> {
            var productoEliminar = ordenPedido.getProductoporID(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encontró el producto"));
            ordenPedido.eliminarProducto(productoEliminar.identity());
        });

        apply((TelefonoMinimarketActualizado event) -> {
            var Minimarket = ordenPedido.miniMarket;
            Minimarket.actualizarTelefono(event.getMiniMarket().getTelefono());
            ordenPedido.miniMarket = Minimarket;
        });

        apply((TelefonoProveedorActualizado event) ->{
            var Proveedor = ordenPedido.proveedor;
            Proveedor.actualizarTelefono(event.getProveedor().getTelefono());
            ordenPedido.proveedor = Proveedor;
        });
    }
}
