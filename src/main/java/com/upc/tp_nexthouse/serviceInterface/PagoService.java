package com.upc.tp_nexthouse.serviceInterface;


import com.upc.tp_nexthouse.Entities.Pago;
import com.upc.tp_nexthouse.Entities.Propiedad;

import java.util.List;

public interface PagoService {
    public Pago savedPago(Pago pago);
    public void eliminarPago(Long  id);
    public Pago modificarPago(Pago pago);
    public List<Pago> list();

}
