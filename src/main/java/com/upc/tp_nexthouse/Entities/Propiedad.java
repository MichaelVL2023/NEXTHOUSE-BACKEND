package com.upc.tp_nexthouse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Propiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPropiedad;

    private String titulo;
    private String descripcion;
    private double precio;
    private String tipo;
    private String estado;
    private LocalDate fechaPublicacion;
    private String descripcionUsuario;

    @ManyToOne
    @JoinColumn(name = "ubicacion_id_ubicacion")
    private Ubicacion ubicacion;

    @ManyToOne
    @JoinColumn(name = "Usuario_id_Arrendatario")
    private Usuario usuario;




}
