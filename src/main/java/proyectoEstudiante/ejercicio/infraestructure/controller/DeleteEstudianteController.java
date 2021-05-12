package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyectoEstudiante.ejercicio.infraestructure.repository.DeleteEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")
public class DeleteEstudianteController {
    @Autowired
    DeleteEstudiantePortRepository deleteEstudiantePortRepository;

    @DeleteMapping("{id}")
    public void DeleteEstudiante(@PathVariable int id){
        deleteEstudiantePortRepository.deleteEstudianteById(id);
    }
}
