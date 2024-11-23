package src.main.java.com.ferreteria.clarita.repository;

import com.ferreteria.clarita.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
