package proyectoEstudiante.ejercicio.infraestructure.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.CreateEstudiantePortRepositorio;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")

public class CreateEstudianteController {

    @Autowired
    CreateEstudiantePortRepositorio createEstudiantePortRepositorio;

    @PostMapping("/")
    public ResponseEntity PostEstudiante(@RequestBody EstudianteInputDto estudianteInputDto) {
        try {
            return   createEstudiantePortRepositorio.createEstudiante(estudianteInputDto);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear");
        }
    }

}
