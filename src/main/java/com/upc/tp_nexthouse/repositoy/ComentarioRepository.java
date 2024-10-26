package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.Entities.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
