package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MensajeDTO {
    private Long idMensaje;
    private String contenido;
    private LocalDate fechaEnvio;
    private String tipo;
    private Usuario usuario; // Referencia al Usuario
}
