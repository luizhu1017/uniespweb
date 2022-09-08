package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 1300)
@RequestMapping("/usuarios")
public class UsuarioResource {

    private final UsuarioRepository userRepository;

    public UsuarioResource(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Usuario> getUsers() {
        return (List<Usuario>) userRepository.findAll();
    }

    @PostMapping
    void addUser(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }
}
