package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.RoleDTO;
import com.upc.tp_nexthouse.Entities.Role;
import com.upc.tp_nexthouse.serviceInterface.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class RoleController {
    @Autowired
    private RoleService rolService;
    @PostMapping("/Rol")
    public RoleDTO insertar(@RequestBody RoleDTO rolDTO){
        ModelMapper modelMapper= new ModelMapper();
        Role rol= modelMapper.map(rolDTO, Role.class);
        rol= rolService.savedRol(rol);
        return modelMapper.map(rol, RoleDTO.class);
    }
    @GetMapping("/Listar_Rol")
    public List<RoleDTO> list(){
        return rolService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Rol")
    public RoleDTO modificarRol(@RequestBody RoleDTO rolDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Role rol = modelMapper.map(rolDTO, Role.class);
        rol = rolService.modificarRol(rol);
        return modelMapper.map(rol, RoleDTO.class);
    }

    @DeleteMapping("/Eliminar_Rol")
    public void eliminarRol(@RequestBody RoleDTO rolDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Role rol = modelMapper.map(rolDTO, Role.class);
        rolService.eliminarRol(rol.getIdRole());
    }


}
