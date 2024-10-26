package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.DTO.ReservaAlquilerDTO;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;
import com.upc.tp_nexthouse.repositoy.ReservaAlquilerRepository;
import com.upc.tp_nexthouse.serviceInterface.ReservaAlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaAlquilerServiceImplement implements ReservaAlquilerService {
    @Autowired
    private ReservaAlquilerRepository reservaAlquilerRepository;
    @Transactional
    @Override
    public ReservaAlquiler savedReservaAlquiler(ReservaAlquiler reservaAlquiler) {
        return reservaAlquilerRepository.save(reservaAlquiler);
    }

    @Override
    public void eliminarReservaAlquiler(Long id) {
        if(reservaAlquilerRepository.existsById(id)) {
            reservaAlquilerRepository.deleteById(id);
        }

    }

    @Override
    public ReservaAlquiler modificarReservaAlquiler(ReservaAlquiler reservaAlquiler) {
        if(reservaAlquilerRepository.existsById(reservaAlquiler.getIdReserva())){
            return reservaAlquilerRepository.save(reservaAlquiler);
        }
        return null;
    }

    @Override
    public List<ReservaAlquiler> list() {
        return reservaAlquilerRepository.findAll();
    }

    @Override
    public List<ReservaAlquilerDTO> query3(LocalDate startDate, LocalDate endDate) {
        try{
            return reservaAlquilerRepository.query3(startDate, endDate);
        }catch (Exception e){
            return null;
        }

    }


}
