package com.estudianteservice.controllers;

import com.estudianteservice.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;
    @GetMapping("/agregar-estudiante")
    public String agregarEstudiante() {
        return "agregar-estudiante";
    }

    @PostMapping("/guardar-estudiante")
    public String guardarEstudiante(
            @RequestParam String rut,
            @RequestParam String apellidos,
            @RequestParam String nombres,
            @RequestParam String fechaNacimiento,
            @RequestParam String tipoColegioProcedencia,
            @RequestParam String nombreColegio,
            @RequestParam Integer anoEgresoColegio,
            @RequestParam Integer tipoPago
    ) {
        estudianteService.guardarEstudiante(rut, apellidos, nombres, fechaNacimiento, tipoColegioProcedencia, nombreColegio, anoEgresoColegio, tipoPago);

        return "redirect:/"; // Puedes redirigir a una página de confirmación o a donde sea necesario
    }
}
