package com.estudianteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name="estudiantes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstudianteEntity {
    @Id
    private String rut;
    private String apellidos;
    private String nombres;
    private String fechaNacimiento;
    private String tipoColegioProcedencia;
    private String nombreColegio;
    private Integer anoEgresoColegio;
    private Integer tipoPago;

}
