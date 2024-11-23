package src.main.java.com.ferreteria.clarita.controller;

import com.ferreteria.clarita.entity.Usuario;
import com.ferreteria.clarita.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/registro")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword())); // Encripta la contraseña
        return usuarioService.guardarUsuario(usuario);
    }

    // Endpoint para obtener un usuario por su username
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable String username) {
        return usuarioService.buscarPorUsername(username);
    }
}
