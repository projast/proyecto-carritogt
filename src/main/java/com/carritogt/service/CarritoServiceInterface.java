package com.carritogt.service;

import com.carritogt.models.Carrito;
import com.carritogt.models.CarritoSelec;

public interface CarritoServiceInterface {
    void agregarCarrito(CarritoSelec producto);
    Carrito obtenerCarrito();
    void vaciarCarrito();
    void eliminarProducto(Long productoId);
}
