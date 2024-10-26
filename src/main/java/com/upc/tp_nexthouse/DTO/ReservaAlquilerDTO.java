package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Usuario;
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
public class ReservaAlquilerDTO {
    private Long idReserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioMensual;
    private String estado;
    private Usuario usuario; // Referencia al Usuario

}
