package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.Entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}
