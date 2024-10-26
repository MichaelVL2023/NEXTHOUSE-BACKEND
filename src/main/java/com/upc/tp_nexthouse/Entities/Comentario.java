package com.upc.tp_nexthouse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    private String calificacion;
    private String tipoUsuario;
    private LocalDate fechaComentario;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "Propiedad_id_propiedad")
    private Propiedad propiedad;

    @ManyToOne
    @JoinColumn(name = "Usuario_id_Arrendatario")
    private Usuario usuario;
}
