package com.upc.tp_nexthouse.serviceInterface;


import com.upc.tp_nexthouse.Entities.Mensaje;
import com.upc.tp_nexthouse.Entities.OpcionesPago;

import java.util.List;

public interface MensajeService {
    public Mensaje savedMensaje(Mensaje mensaje);
    public void eliminarMensaje(Long  id);
    public Mensaje modificarMensaje(Mensaje mensaje);
    public List<Mensaje> list();
}
