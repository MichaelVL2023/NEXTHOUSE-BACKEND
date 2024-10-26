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
public class ReservaAlquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioMensual;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "Usuario_id_Arrendatario")
    private Usuario usuario;
}
