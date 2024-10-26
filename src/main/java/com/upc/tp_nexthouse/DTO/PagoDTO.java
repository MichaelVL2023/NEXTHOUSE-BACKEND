package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.OpcionesPago;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class PagoDTO {
    private Long idPago;

    private LocalDate fechaTransaccion;
    private double monto;
    private ReservaAlquiler reserva;
    private OpcionesPago opcionesPago; // Lista de IDs de Comentarios
}
