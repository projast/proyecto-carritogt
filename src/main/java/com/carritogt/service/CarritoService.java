package com.carritogt.service;

import com.carritogt.models.Carrito;
import com.carritogt.models.CarritoSelec;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class CarritoService implements CarritoServiceInterface{

    private Carrito carrito;
    public CarritoService(){
        this.carrito = new Carrito();
    }


    @Override
    public void agregarCarrito(CarritoSelec producto) {
        carrito.agregarProducto(producto);
    }

    @Override
    public Carrito obtenerCarrito() {
        return carrito;
    }

    @Override
    public void vaciarCarrito() {
        this.carrito = new Carrito();
    }

    @Override
    public void eliminarProducto(Long productoId) {
        Iterator<CarritoSelec> iterator = carrito.select.iterator();

        while (iterator.hasNext()){
            CarritoSelec item = iterator.next();
            if (item.getProducto() != null &&
                item.getProducto().getId().equals(productoId)){
                iterator.remove();
                break;
            }
        }
    }
}
