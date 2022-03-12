package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.ordenPedido.eventos.*;
import co.com.sofka.domain.ordenPedido.valor.Fecha;

import java.util.ArrayList;

public class OrdenPedidoChange extends EventChange {

    public OrdenPedidoChange(OrdenPedido ordenPedido) {

        apply((OrdenPedidoCreado event) -> {
            ordenPedido.fecha = new Fecha();
            ordenPedido.productos = new ArrayList<>();
        });

        apply((MiniMarketCreado event) -> {
            ordenPedido.miniMarket = new MiniMarket(event.getTiendaId(), event.getNombre(), event.getTelefono(), event.getDireccion());
        });

        apply((ProveedorCreado event) -> {
            ordenPedido.proveedor = new Proveedor(event.getProveedorId(), event.getNombre(), event.getTelefono());
        });

        apply((DireccionMinimarketActualizado event) -> {
            var minimarket = ordenPedido.miniMarket;
            minimarket.actualizarDireccion(event.getDireccion());
        });

        apply((NombreMinimarketActualizado event) -> {
            var miniMarket = ordenPedido.miniMarket;
            miniMarket.actualizarNombre(event.getNombre());
        });

        apply((NombreProveedorActualizado event) -> {
            var proveedor = ordenPedido.proveedor;
            proveedor.actualizarNombre(event.getNombre());
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
            Minimarket.actualizarTelefono(event.getTelefono());
        });

        apply((TelefonoProveedorActualizado event) ->{
            var Proveedor = ordenPedido.proveedor;
            Proveedor.actualizarTelefono(event.getTelefono());
        });
    }
}
