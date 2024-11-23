package src.main.java.com.ferreteria.clarita.service.Implementation;

import com.ferreteria.clarita.entity.Producto;
import com.ferreteria.clarita.repository.ProductoRepository;
import com.ferreteria.clarita.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Lista todos los productos disponibles
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Agrega un nuevo producto
    @Override
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Modifica un producto existente
    @Override
    public Producto modificarProducto(Long id, Producto producto) {
        Producto productoExistente = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setDescripcion(producto.getDescripcion());
        productoExistente.setPrecio(producto.getPrecio());
        return productoRepository.save(productoExistente);
    }

    // Elimina un producto por su ID
    @Override
    public void eliminarProducto(Long id) {
        if (!productoRepository.existsById(id)) {
            throw new RuntimeException("Producto no encontrado");
        }
        productoRepository.deleteById(id);
    }
}
