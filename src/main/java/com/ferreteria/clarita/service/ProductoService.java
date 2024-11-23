package src.main.java.com.ferreteria.clarita.service;

import com.ferreteria.clarita.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listarProductos();
    Producto agregarProducto(Producto producto);
    Producto modificarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);
}

