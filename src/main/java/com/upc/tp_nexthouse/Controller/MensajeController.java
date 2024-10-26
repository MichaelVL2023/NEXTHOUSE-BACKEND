package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.MensajeDTO;
import com.upc.tp_nexthouse.DTO.UsuarioDTO;
import com.upc.tp_nexthouse.Entities.Mensaje;
import com.upc.tp_nexthouse.Entities.Usuario;
import com.upc.tp_nexthouse.serviceInterface.MensajeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;
    @PostMapping("/Mensaje")
    public MensajeDTO insertar(@RequestBody MensajeDTO mensajeDTO){
        ModelMapper modelMapper= new ModelMapper();
        Mensaje mensaje= modelMapper.map(mensajeDTO, Mensaje.class);
        mensaje= mensajeService.savedMensaje(mensaje);
        return modelMapper.map(mensaje, MensajeDTO.class);
    }
    @GetMapping("/Listar_Mensajes")
    public List<MensajeDTO> list(){
        return mensajeService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, MensajeDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Mensaje")
    public MensajeDTO modificarMensaje(@RequestBody MensajeDTO mensajeDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Mensaje mensaje = modelMapper.map(mensajeDTO, Mensaje.class);
        mensaje = mensajeService.modificarMensaje(mensaje);
        return modelMapper.map(mensaje, MensajeDTO.class);
    }

    @DeleteMapping("/Eliminar_Mensaje")
    public void eliminarMensaje(@RequestBody MensajeDTO mensajeDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Mensaje mensaje = modelMapper.map(mensajeDTO, Mensaje.class);
        mensajeService.eliminarMensaje(mensaje.getIdMensaje());
    }

}
