package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long idUsuario;
    private String DNI;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private String username;
    private String password;

    private Role rol;

}
