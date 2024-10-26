package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.DTO.Query1DTO;
import com.upc.tp_nexthouse.Entities.OpcionesPago;
import com.upc.tp_nexthouse.repositoy.OpcionesPagoRepository;
import com.upc.tp_nexthouse.serviceInterface.OpcionesPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OpcionesPagoServiceImplement implements OpcionesPagoService {
    @Autowired
    private OpcionesPagoRepository opcionesPagoRepository;
    @Transactional
    @Override
    public OpcionesPago savedOpcionesPago(OpcionesPago opcionesPago) {
        return opcionesPagoRepository.save(opcionesPago);
    }

    @Override
    public void eliminarOpcionesPago(Long id) {
        if(opcionesPagoRepository.existsById(id)) {
            opcionesPagoRepository.deleteById(id);
        }
    }

    @Override
    public OpcionesPago modificarOpcionesPago(OpcionesPago opcionesPago) {
        if(opcionesPagoRepository.existsById(opcionesPago.getIdOppago())){
            return opcionesPagoRepository.save(opcionesPago);
        }
        return null;
    }

    @Override
    public List<OpcionesPago> list() {
        return opcionesPagoRepository.findAll();
    }

    @Override
    public List<Query1DTO> query1DTO() {
        try {
            return opcionesPagoRepository.query1();
        }catch (Exception e){
            return null;
        }

    }
}
