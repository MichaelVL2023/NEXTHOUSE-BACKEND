package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.Entities.Usuario;
import com.upc.tp_nexthouse.repositoy.UsuarioRepository;
import com.upc.tp_nexthouse.serviceInterface.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImplement implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Transactional
    @Override
    public Usuario savedUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    @Override
    public void eliminarUsuario(Long id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        }
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        if(usuarioRepository.existsById(usuario.getId())){
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    @Override
    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }




}
