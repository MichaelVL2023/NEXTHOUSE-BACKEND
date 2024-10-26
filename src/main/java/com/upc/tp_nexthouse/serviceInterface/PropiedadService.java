package com.upc.tp_nexthouse.serviceInterface;


import com.upc.tp_nexthouse.DTO.Query2DTO;
import com.upc.tp_nexthouse.DTO.Query4DTO;
import com.upc.tp_nexthouse.Entities.Propiedad;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;

import java.util.List;

public interface PropiedadService {
    public Propiedad savedPropiedad(Propiedad propiedad);
    public void eliminarPropiedad(Long  id);
    public Propiedad modificarPropiedad(Propiedad propiedad);
    public List<Propiedad> list();
    public  List<Query2DTO>query2();
    public List<Query4DTO>query4();

}
