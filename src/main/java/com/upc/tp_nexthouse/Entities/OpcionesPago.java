package com.upc.tp_nexthouse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OpcionesPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOppago;

    private String metodoPago;
    private String descripcion;

}
