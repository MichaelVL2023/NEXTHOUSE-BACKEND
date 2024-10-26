package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.ReservaAlquilerDTO;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;
import com.upc.tp_nexthouse.serviceInterface.ReservaAlquilerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class ReservaAlquilerController {
    @Autowired
    private ReservaAlquilerService reservaAlquilerService;
    @PostMapping("/ReservaAlquiler")
    public ReservaAlquilerDTO insertar(@RequestBody ReservaAlquilerDTO reservaAlquilerDTO){
        ModelMapper modelMapper= new ModelMapper();
        ReservaAlquiler reservaAlquiler= modelMapper.map(reservaAlquilerDTO, ReservaAlquiler.class);
        reservaAlquiler= reservaAlquilerService.savedReservaAlquiler(reservaAlquiler);
        return modelMapper.map(reservaAlquiler, ReservaAlquilerDTO.class);
    }
    @GetMapping("/Listar_ReservaAlquiler")
    public List<ReservaAlquilerDTO> list(){
        return reservaAlquilerService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, ReservaAlquilerDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/Modificar_ReservaAlquiler")
    public ReservaAlquilerDTO modificarReservaAlquiler(@RequestBody ReservaAlquilerDTO reservaAlquilerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ReservaAlquiler reservaAlquiler = modelMapper.map(reservaAlquilerDTO, ReservaAlquiler.class);
        reservaAlquiler = reservaAlquilerService.modificarReservaAlquiler(reservaAlquiler);
        return modelMapper.map(reservaAlquiler, ReservaAlquilerDTO.class);
    }

    @DeleteMapping("/Eliminar_ReservaAlquiler")
    public void eliminarReservaAlquiler(@RequestBody ReservaAlquilerDTO reservaAlquilerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ReservaAlquiler reservaAlquiler = modelMapper.map(reservaAlquilerDTO, ReservaAlquiler.class);
        reservaAlquilerService.eliminarReservaAlquiler(reservaAlquiler.getIdReserva());
    }

    @GetMapping("/Query3_ReservaAlquieler")
    @PreAuthorize("hasAuthority('ROLE_ARRENDADOR')")
    public List<ReservaAlquilerDTO> query3(LocalDate startDate, LocalDate endDate){
        return  reservaAlquilerService.query3(startDate, endDate);
    }
}
