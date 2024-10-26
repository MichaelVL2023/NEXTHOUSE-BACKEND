package com.upc.tp_nexthouse.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpcionesPagoDTO {
    private Long idOppago;

    private String metodoPago;
    private String descripcion;
}
