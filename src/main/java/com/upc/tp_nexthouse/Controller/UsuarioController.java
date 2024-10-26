package com.upc.tp_nexthouse.Controller;


import com.upc.tp_nexthouse.DTO.UsuarioDTO;
import com.upc.tp_nexthouse.Entities.Usuario;
import com.upc.tp_nexthouse.serviceInterface.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder bcrypt;

    @PostMapping("/Usuario")
    public UsuarioDTO insertar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper modelMapper= new ModelMapper();
        Usuario usuario= modelMapper.map(usuarioDTO, Usuario.class);
        usuario.setPassword(bcrypt.encode(usuario.getPassword()));
        usuario= usuarioService.savedUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }


    @GetMapping("/Listar_Usuario")
    public List<UsuarioDTO> list(){
        return usuarioService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/Modificar_Usuario")
    public UsuarioDTO modificarUsuraio(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
        usuario = usuarioService.modificarUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    @DeleteMapping("/Eliminar_Usuraio")
    public void eliminarUsuraio(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
        usuarioService.eliminarUsuario(usuario.getIdUsuario());
    }


}
