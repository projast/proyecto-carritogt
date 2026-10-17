package com.carritogt.controller;

import com.carritogt.models.Carrito;
import com.carritogt.models.CarritoSelec;
import com.carritogt.models.Producto;

import com.carritogt.service.CarritoServiceInterface;
import com.carritogt.service.ProductoServiceInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/carritogt")
public class CarritoController {

    private final CarritoServiceInterface carritoService;
    private final ProductoServiceInterface productoService;

    public CarritoController(
            CarritoServiceInterface carritoService,
            ProductoServiceInterface productoService) {

        this.carritoService = carritoService;
        this.productoService = productoService;
    }

    // Mostrar carrito
    @GetMapping
    public String verCarrito(Model model) {

        Carrito carrito = carritoService.obtenerCarrito();

        model.addAttribute("carrito", carrito);

        return "carrito";
    }

    // Agregar producto al carrito
    @PostMapping("/agregar")
    public String agregarProducto(
            @RequestParam Long productoId) {

        Producto producto =
                productoService.obtenerProductoPorId(productoId);

        if (producto != null) {

            CarritoSelec item =
                    new CarritoSelec(producto, 1);

            carritoService.agregarCarrito(item);
        }

        return "redirect:/carritogt";
    }

    // Obtener carrito en JSON
    @GetMapping("/json")
    @ResponseBody
    public Carrito obtenerCarritoJson() {

        return carritoService.obtenerCarrito();
    }

    // Obtener artículos del carrito en JSON
    @GetMapping("/json/item")
    @ResponseBody
    public List<CarritoSelec> obtenerItemsJson() {

        return carritoService.obtenerCarrito().select;
    }

    // Eliminar un producto del carrito
    @PostMapping("/eliminar")
    public String eliminarProducto(
            @RequestParam Long productoId) {

        carritoService.eliminarProducto(productoId);

        return "redirect:/carritogt";
    }

    // Vaciar carrito
    @PostMapping("/vaciar")
    public String vaciarCarrito() {

        carritoService.vaciarCarrito();

        return "redirect:/carritogt";
    }

    // Finalizar compra
    @PostMapping("/comprar")
    public String comprar() {

        carritoService.vaciarCarrito();

        return "redirect:/carritogt/compra-exitosa";
    }

    // Mostrar confirmación de compra
    @GetMapping("/compra-exitosa")
    public String mostrarCompraExitosa() {

        return "compra-exitosa";
    }
}