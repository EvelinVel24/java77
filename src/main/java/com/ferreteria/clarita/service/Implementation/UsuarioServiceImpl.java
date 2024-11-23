package src.main.java.com.ferreteria.clarita.service.Implementation;

import com.ferreteria.clarita.entity.Usuario;
import com.ferreteria.clarita.repository.UsuarioRepository;
import com.ferreteria.clarita.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario buscarPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }
}
