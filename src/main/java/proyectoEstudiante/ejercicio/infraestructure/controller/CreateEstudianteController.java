package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.CreateEstudiantePortRepositorio;

@RestController
@RequestMapping("/api/estudiante")

public class CreateEstudianteController {

    @Autowired
    CreateEstudiantePortRepositorio createEstudiantePortRepositorio;

    @PostMapping("/")
    public void PostEstudiante(@RequestBody EstudianteInputDto estudianteInputDto){
        createEstudiantePortRepositorio.createEstudiante(estudianteInputDto);
    }

}
