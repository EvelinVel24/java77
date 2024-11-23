package src.main.java.com.ferreteria.clarita.controller;

import com.ferreteria.clarita.entity.Producto;
import com.ferreteria.clarita.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listar() {
        return productoService.listarProductos();
    }

    @PostMapping
    public Producto agregar(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto modificar(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.modificarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
