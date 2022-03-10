package co.com.sofka.domain.ordenPedido;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ordenPedido.valor.Descripcion;
import co.com.sofka.domain.ordenPedido.valor.Nombre;
import co.com.sofka.domain.ordenPedido.valor.Precio;
import co.com.sofka.domain.ordenPedido.valor.ProductoId;

public class Producto extends Identity {

    private ProductoId productoId;
    private Precio precio;
    private Descripcion descripcion;
    private Nombre nombre;
}
