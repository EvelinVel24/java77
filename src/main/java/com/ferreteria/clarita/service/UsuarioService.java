package src.main.java.com.ferreteria.clarita.service;

import com.ferreteria.clarita.entity.Usuario;

public interface UsuarioService {
    Usuario buscarPorUsername(String username);
}
