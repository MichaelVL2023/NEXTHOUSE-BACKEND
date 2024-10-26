package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.*;
import com.upc.tp_nexthouse.Entities.Propiedad;
import com.upc.tp_nexthouse.serviceInterface.PropiedadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class PropiedadController {
    @Autowired
    private PropiedadService propiedadService;

    @PostMapping("/Propiedad")
    public PropiedadDTO insertar(@RequestBody PropiedadDTO propiedadDTO){
        ModelMapper modelMapper= new ModelMapper();
        Propiedad propiedad= modelMapper.map(propiedadDTO, Propiedad.class);
        propiedad= propiedadService.savedPropiedad(propiedad);
        return modelMapper.map(propiedad, PropiedadDTO.class);
    }
    @GetMapping("/Listar_Propiedad")
    public List<PropiedadDTO> list(){
        return propiedadService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, PropiedadDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Propiedad")
    public PropiedadDTO modificarPropiedad(@RequestBody PropiedadDTO propiedadDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Propiedad propiedad = modelMapper.map(propiedadDTO, Propiedad.class);
        propiedad = propiedadService.modificarPropiedad(propiedad);
        return modelMapper.map(propiedad, PropiedadDTO.class);
    }

    @DeleteMapping("/Eliminar_Propiedad")
    public void eliminarPropiedad(@RequestBody PropiedadDTO propiedadDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Propiedad propiedad = modelMapper.map(propiedadDTO, Propiedad.class);
        propiedadService.eliminarPropiedad(propiedad.getIdPropiedad());
    }

    @GetMapping("/Query2_Propiedad")
    @PreAuthorize("hasAuthority('ROLE_ARRENDATARIO')")
    public List<Query2DTO> query2(){
        return  propiedadService.query2();
    }

    @GetMapping("/Query4_Propiedad")
    @PreAuthorize("hasAuthority('ROLE_ARRENDADOR')")
    public List<Query4DTO> query4(){
        return  propiedadService.query4();
    }


}
