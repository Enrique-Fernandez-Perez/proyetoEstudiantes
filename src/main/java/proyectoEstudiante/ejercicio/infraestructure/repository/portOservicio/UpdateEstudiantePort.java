package proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import proyectoEstudiante.ejercicio.Exceptions.UpdateErrorException;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

public interface UpdateEstudiantePort {

    public EstudianteOutputDto updateEstudiante(@PathVariable int id, @RequestBody EstudianteInputDto estudianteInputDto) throws UpdateErrorException;
}
