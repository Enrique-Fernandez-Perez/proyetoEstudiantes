package proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio;

import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

public interface GetByIdEstudiantePort {
    public EstudianteOutputDto getEstudiantebyId(int id) throws Exception;
}
