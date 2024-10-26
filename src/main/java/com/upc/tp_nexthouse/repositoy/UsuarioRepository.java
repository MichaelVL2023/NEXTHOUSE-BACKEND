package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);


}
