package com.cuotaservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteModel {

    private String rut;
    private String apellidos;
    private String nombres;
    private String nacimiento;
    private String tipocolegio;
    private String nombrecolegio;
    private String añoegresocolegio;
    private String tipodepago;
    private int cantidad_cuotas;

}
