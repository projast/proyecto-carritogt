package com.carritogt.controller;

import com.carritogt.models.Producto;
import com.carritogt.service.ProductoServiceInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoServiceInterface productoService;

    public ProductoController(
            ProductoServiceInterface productoService) {
        this.productoService = productoService;
    }

    // Mostrar catálogo de productos
    @GetMapping
    public String listarProductos(Model model) {

        List<Producto> productos =
                productoService.listarProductos();

        model.addAttribute("productos", productos);

        return "productos";
    }

    // Mostrar detalle de un producto
    @GetMapping("/{id}")
    public String verDetalleProducto(
            @PathVariable Long id,
            Model model) {

        Producto producto =
                productoService.obtenerProductoPorId(id);

        if (producto == null) {
            return "redirect:/productos";
        }

        model.addAttribute("producto", producto);

        return "producto-detalle";
    }

    // Obtener todos los productos en JSON
    @GetMapping("/json")
    @ResponseBody
    public List<Producto> listarProductoJson() {

        return productoService.listarProductos();
    }

    // Obtener producto por ID en JSON
    @GetMapping("/json/{id}")
    @ResponseBody
    public Producto obtenerProductoJson(
            @PathVariable Long id) {

        return productoService.obtenerProductoPorId(id);
    }
}
