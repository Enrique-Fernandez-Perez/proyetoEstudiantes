package proyectoEstudiante.ejercicio.infraestructure.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void PostEstudiante(@RequestBody EstudianteInputDto estudianteInputDto){
        createEstudiantePortRepositorio.createEstudiante(estudianteInputDto);
    }

}
