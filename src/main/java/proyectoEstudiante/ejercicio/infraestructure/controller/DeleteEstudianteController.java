package proyectoEstudiante.ejercicio.infraestructure.controller;

import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectoEstudiante.ejercicio.infraestructure.repository.DeleteEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")
public class DeleteEstudianteController {
    @Autowired
    DeleteEstudiantePortRepository deleteEstudiantePortRepository;

    @DeleteMapping("{id}")
    public ResponseEntity DeleteEstudiante(@PathVariable int id) {
        try {
            deleteEstudiantePortRepository.deleteEstudianteById(id);
            return ResponseEntity.accepted().body("Eliminado con exito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al eliminar");
        }
    }
}
