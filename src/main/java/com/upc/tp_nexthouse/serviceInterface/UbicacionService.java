package com.upc.tp_nexthouse.serviceInterface;


import com.upc.tp_nexthouse.Entities.Mensaje;
import com.upc.tp_nexthouse.Entities.Ubicacion;
import com.upc.tp_nexthouse.Entities.Usuario;

import java.util.List;

public interface UbicacionService {
    public Ubicacion savedUbicacion(Ubicacion ubicacion);
    public void eliminarUbicacion(Long  id);
    public Ubicacion modificarUbicacion(Ubicacion ubicacion);
    public List<Ubicacion> list();
}
