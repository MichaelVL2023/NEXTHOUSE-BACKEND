package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.ComentarioDTO;
import com.upc.tp_nexthouse.Entities.Comentario;
import com.upc.tp_nexthouse.serviceInterface.ComentarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"}) //se cambia por la ip de servicio que da el amazon el PublicIPs:
@RestController
@RequestMapping("/NextHouse")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @PostMapping("/Comentario")
    public ComentarioDTO insertar(@RequestBody ComentarioDTO comentarioDTO){
        ModelMapper modelMapper= new ModelMapper();
        Comentario comentario= modelMapper.map(comentarioDTO, Comentario.class);
        comentario= comentarioService.savedComentario(comentario);
        return modelMapper.map(comentario, ComentarioDTO.class);
    }
    @GetMapping("/Listar_Comentarios")
    public List<ComentarioDTO> list(){
        return comentarioService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Comentario")
    public ComentarioDTO modificarComentario(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario comentario = modelMapper.map(comentarioDTO, Comentario.class);
        comentario = comentarioService.modificarComentario(comentario);
        return modelMapper.map(comentario, ComentarioDTO.class);
    }

    @DeleteMapping("/Eliminar_Comentario")
    public void eliminarComentario(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario comentario = modelMapper.map(comentarioDTO, Comentario.class);
        comentarioService.eliminarComentario(comentario.getIdComentario());
    }

}
