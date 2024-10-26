package com.upc.tp_nexthouse.serviceInterface;



import com.upc.tp_nexthouse.DTO.ReservaAlquilerDTO;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;

import java.time.LocalDate;
import java.util.List;

public interface ReservaAlquilerService {
    public ReservaAlquiler savedReservaAlquiler(ReservaAlquiler reservaAlquiler);
    public void eliminarReservaAlquiler(Long  id);
    public ReservaAlquiler modificarReservaAlquiler(ReservaAlquiler reservaAlquiler);
    public List<ReservaAlquiler> list();
    public List<ReservaAlquilerDTO>query3(LocalDate startDate,LocalDate endDate);
}
