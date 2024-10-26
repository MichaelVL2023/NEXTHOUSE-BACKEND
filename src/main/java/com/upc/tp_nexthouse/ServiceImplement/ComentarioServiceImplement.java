package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.Entities.Comentario;
import com.upc.tp_nexthouse.repositoy.ComentarioRepository;
import com.upc.tp_nexthouse.serviceInterface.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComentarioServiceImplement implements ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;
    @Transactional
    @Override
    public Comentario savedComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public void eliminarComentario(Long id) {
        if(comentarioRepository.existsById(id)) {
            comentarioRepository.deleteById(id);
        }
    }

    @Override
    public Comentario modificarComentario(Comentario comentario) {
        if(comentarioRepository.existsById(comentario.getIdComentario())){
            return comentarioRepository.save(comentario);
        }
        return null;
    }

    @Override
    public List<Comentario> list() {
        return comentarioRepository.findAll();
    }
}
