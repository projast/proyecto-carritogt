package com.carritogt.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrito {
    public List<CarritoSelec> select = new ArrayList<>();
    public void agregarProducto(CarritoSelec Producto){
        select.add(Producto);
    }
    public double getTotal(){
        return select.stream().mapToDouble(CarritoSelec::getSubTotal).sum();
    }
}
