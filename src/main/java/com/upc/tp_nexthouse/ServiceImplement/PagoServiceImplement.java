package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.Entities.Pago;
import com.upc.tp_nexthouse.repositoy.PagoRepository;
import com.upc.tp_nexthouse.serviceInterface.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PagoServiceImplement implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;
    @Transactional
    @Override
    public Pago savedPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public void eliminarPago(Long id) {
        if(pagoRepository.existsById(id)) {
            pagoRepository.deleteById(id);
        }
    }

    @Override
    public Pago modificarPago(Pago pago) {
        if(pagoRepository.existsById(pago.getIdPago())){
            return pagoRepository.save(pago);
        }
        return null;
    }

    @Override
    public List<Pago> list() {
        return pagoRepository.findAll();
    }
}
