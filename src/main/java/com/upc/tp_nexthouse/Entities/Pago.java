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
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;

    private LocalDate fechaTransaccion;
    private double monto;

    @ManyToOne
    @JoinColumn(name = "ReservaAlquiler_id_reserva")
    private ReservaAlquiler reserva;

    @ManyToOne
    @JoinColumn(name = "opciones_pago_id_pago")
    private OpcionesPago opcionesPago;
}
