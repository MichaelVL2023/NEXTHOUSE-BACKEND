package com.upc.tp_nexthouse.serviceInterface;

import com.upc.tp_nexthouse.Entities.Comentario;
import com.upc.tp_nexthouse.Entities.Mensaje;

import java.util.List;

public interface ComentarioService {
    public Comentario savedComentario(Comentario comentario);
    public void eliminarComentario(Long  id);
    public Comentario modificarComentario(Comentario comentario);
    public List<Comentario> list();
}
