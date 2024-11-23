package src.main.java.com.ferreteria.clarita.repository;

import com.ferreteria.clarita.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
