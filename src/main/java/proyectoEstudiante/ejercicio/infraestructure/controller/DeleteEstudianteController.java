package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoEstudiante.ejercicio.infraestructure.repository.DeleteEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
public class DeleteEstudianteController {
    @Autowired
    DeleteEstudiantePortRepository deleteEstudiantePortRepository;

    @DeleteMapping("{id}")
    public void DeleteEstudiante(@PathVariable int id){
        deleteEstudiantePortRepository.deleteEstudianteById(id);
    }
}
