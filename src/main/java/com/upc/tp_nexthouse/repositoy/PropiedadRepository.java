package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.DTO.Query2DTO;
import com.upc.tp_nexthouse.DTO.Query4DTO;
import com.upc.tp_nexthouse.Entities.Propiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PropiedadRepository extends JpaRepository<Propiedad,Long> {
    @Query("select new com.upc.tp_nexthouse.DTO.Query2DTO(u.nombreCompleto, p.titulo) " +
            "from Propiedad p join p.usuario u join u.rol r " +
            "where p.tipo = 'Casa' and p.estado = 'Disponible' and r.rol = 'Arrendatario' " +
            "group by u.nombreCompleto, p.titulo")
    List<Query2DTO> query2();

    @Query("SELECT new com.upc.tp_nexthouse.DTO.Query4DTO(u.ciudad, p.precio) " +
            "FROM Propiedad p JOIN p.ubicacion u JOIN p.usuario us JOIN us.rol r " +
            "WHERE r.rol = 'Arrendador' and p.estado = 'Alquiler' " +
            "GROUP BY u.ciudad, p.precio")
    List<Query4DTO> query4();



}
