package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.DTO.Query1DTO;
import com.upc.tp_nexthouse.Entities.OpcionesPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OpcionesPagoRepository extends JpaRepository<OpcionesPago,Long> {
    @Query("select  new com.upc.tp_nexthouse.DTO.Query1DTO(o.metodoPago,count (o.idOppago))" +
            " from OpcionesPago  o " +
            " group by o.metodoPago")
    List<Query1DTO> query1 ();
}
