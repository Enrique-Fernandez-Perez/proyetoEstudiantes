package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proyectoEstudiante.ejercicio.domain.EstudianteJpa;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.GetEstudiantePort;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GetEstudiantePortRepository implements GetEstudiantePort {
    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;

    @Override
    public List<EstudianteOutputDto> getAllEstudiante(){
        List<EstudianteJpa> estudianteJpas = estudianteJpaRepository.findAll();

        List<EstudianteOutputDto> estudianteOutputDtos = estudianteJpas.stream().map(estudianteJpa -> new EstudianteOutputDto(
                        estudianteJpa.getNombre(),
                        estudianteJpa.getApellidos(),
                        estudianteJpa.getEmail(),
                        estudianteJpa.getFechaEntrada(),
                        estudianteJpa.getCiudad(),
                        estudianteJpa.getNumHorasSemanales(),
                        estudianteJpa.getEspecialidad(),
                        estudianteJpa.getEstado()

                )
        ).collect(Collectors.toList());
        return estudianteOutputDtos;
    }
}
