package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.PagoDTO;
import com.upc.tp_nexthouse.Entities.Pago;
import com.upc.tp_nexthouse.serviceInterface.PagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class PagoController {
    @Autowired
    private PagoService pagoService;
    @PostMapping("/Pago")
    public PagoDTO insertar(@RequestBody PagoDTO pagoDTO){
        ModelMapper modelMapper= new ModelMapper();
        Pago pago= modelMapper.map(pagoDTO, Pago.class);
        pago= pagoService.savedPago(pago);
        return modelMapper.map(pago, PagoDTO.class);
    }
        @GetMapping("/Listar_Pago")
 //   @PreAuthorize("hasRole('USER')")

    public List<PagoDTO> list(){
        return pagoService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Pago")
    public PagoDTO modificarPago(@RequestBody PagoDTO pagoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Pago pago = modelMapper.map(pagoDTO, Pago.class);
        pago = pagoService.modificarPago(pago);
        return modelMapper.map(pago, PagoDTO.class);
    }

    @DeleteMapping("/Eliminar_Pago")
    public void eliminarPago(@RequestBody PagoDTO pagoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Pago pago = modelMapper.map(pagoDTO, Pago.class);
        pagoService.eliminarPago(pago.getIdPago());
    }
}
