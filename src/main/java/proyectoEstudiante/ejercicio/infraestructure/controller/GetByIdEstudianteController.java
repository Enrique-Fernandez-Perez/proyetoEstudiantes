package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import proyectoEstudiante.ejercicio.Exceptions.NotFoundException;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.GetByIdEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")
public class GetByIdEstudianteController {
    @Autowired
    GetByIdEstudiantePortRepository getByIdEstudiantePortRepository;

    @GetMapping({"id"})
    public EstudianteOutputDto GetEstudiantebyId(@PathVariable int id) throws NotFoundException {

       return getByIdEstudiantePortRepository.getEstudiantebyId(id);
    }

}
