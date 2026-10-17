package com.carritogt.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarritoSelec {
    private Producto producto;
    private int cantidad;

    public CarritoSelec(){}
    public CarritoSelec(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getSubTotal(){
        if (producto == null) {
        return 0;
        }
        return producto.getPrecio() * cantidad;
    }
}
