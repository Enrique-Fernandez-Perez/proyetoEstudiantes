package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import proyectoEstudiante.ejercicio.domain.EstudianteJpa;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.CreateEstudiantePort;

@Component
public class CreateEstudiantePortRepositorio implements CreateEstudiantePort {

    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;

    @Override
    public void createEstudiante(EstudianteInputDto estudianteInputDto) {
        EstudianteJpa estudianteJpa = new EstudianteJpa();

        estudianteInputDto.dtoInputComprobador(estudianteInputDto);

        estudianteJpa.setNombre(estudianteInputDto.getNombre());
        estudianteJpa.setApellidos(estudianteInputDto.getApellidos());
        estudianteJpa.setEmail(estudianteInputDto.getEmail());
        estudianteJpa.setFechaEntrada(estudianteInputDto.getFechaEntrada());
        estudianteJpa.setCiudad(estudianteInputDto.getCiudad());
        estudianteJpa.setNumHorasSemanales(estudianteInputDto.getNumHorasSemanales());
        estudianteJpa.setEspecialidad(estudianteInputDto.getEspecialidad());
        estudianteJpa.setEstado(estudianteInputDto.getEstado());

        estudianteJpaRepository.save(estudianteJpa);
    }
}
