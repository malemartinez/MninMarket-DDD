package co.com.sofka.domain.carrito.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Total implements ValueObject<Double> {


    //private Double sumarPrecios (Double price){
    // // for (Producto producto: carrito.listarProductos()) {
    //     //     contador = contador + producto.Precio().getPrice();
    //     // }
    // // return contador;
    //

    private final Double price;
    public Total(Double price) {
        this.price = price;
    }

    private Double getPrice() {
        return price;
    }

    @Override
    public Double value() {
        return getPrice();
    }
}
