package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Ubicacion;
import com.upc.tp_nexthouse.Entities.Usuario;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropiedadDTO {
    private Long idPropiedad;

    private String titulo;
    private String descripcion;
    private double precio;
    private String tipo;
    private String estado;
    private LocalDate fechaPublicacion;
    private String descripcionUsuario;
    private Ubicacion ubicacion; // Referencia a Ubicacion
    private Usuario usuario; // Referencia a Usuario
}
