package com.upc.tp_nexthouse.serviceInterface;



import com.upc.tp_nexthouse.DTO.Query1DTO;
import com.upc.tp_nexthouse.Entities.OpcionesPago;
import com.upc.tp_nexthouse.Entities.Pago;

import java.util.List;

public interface OpcionesPagoService {
    public OpcionesPago savedOpcionesPago(OpcionesPago opcionesPago);
    public void eliminarOpcionesPago(Long  id);
    public OpcionesPago modificarOpcionesPago(OpcionesPago opcionesPago);
    public List<OpcionesPago> list();
    public List<Query1DTO> query1DTO();


}
