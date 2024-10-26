package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Propiedad;
import com.upc.tp_nexthouse.Entities.Usuario;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComentarioDTO {
    private Long idComentario;

    private String calificacion;
    private String tipoUsuario;
    private LocalDate fechaComentario;
    private String comentario;
    private Propiedad propiedad;
    private Usuario usuario;
}
