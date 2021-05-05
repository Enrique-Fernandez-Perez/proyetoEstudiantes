package proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio;

import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

import java.util.List;

public interface GetEstudiantePort {
    public List<EstudianteOutputDto> getAllEstudiante();
}
