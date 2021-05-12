package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.GetEstudiantePortRepository;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")
public class GetEstudianteController {

    @Autowired
    GetEstudiantePortRepository getEstudiantePortRepository;

    @GetMapping("/all")
    public List<EstudianteOutputDto> GetEstudiantes(){

        return getEstudiantePortRepository.getAllEstudiante();
    }
}
