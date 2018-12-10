package br.com.pm.virtualapi.resource;


import br.com.pm.virtualapi.model.Usuario;
import br.com.pm.virtualapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

}// end class
