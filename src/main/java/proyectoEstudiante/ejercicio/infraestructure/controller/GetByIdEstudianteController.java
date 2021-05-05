package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.GetByIdEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
public class GetByIdEstudianteController {
    @Autowired
    GetByIdEstudiantePortRepository getByIdEstudiantePortRepository;

    @GetMapping({"id"})
    public EstudianteOutputDto GetEstudiantebyId(@PathVariable int id) throws Exception {

       return getByIdEstudiantePortRepository.getEstudiantebyId(id);
    }

}
