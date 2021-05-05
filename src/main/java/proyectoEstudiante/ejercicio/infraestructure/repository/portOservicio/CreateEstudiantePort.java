package proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio;

import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;

public interface CreateEstudiantePort {
    public  void createEstudiante(EstudianteInputDto estudianteInputDto);
}
