package proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio;

import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;

public interface CreateEstudiantePort {
    public ResponseEntity createEstudiante(EstudianteInputDto estudianteInputDto);
}
