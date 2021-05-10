package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import proyectoEstudiante.ejercicio.domain.EstudianteJpa;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.GetByIdEstudiantePort;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.GetEstudiantePort;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GetByIdEstudiantePortRepository implements GetByIdEstudiantePort {

    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;


    @Override
    public EstudianteOutputDto getEstudiantebyId(int id) throws Exception {

        EstudianteJpa estudianteJpa = estudianteJpaRepository.findById(id).orElseThrow(()->new Exception("Algo ha fallado"));


        EstudianteOutputDto estudianteOutputDto= new EstudianteOutputDto(
                estudianteJpa.getSurname(),
        estudianteJpa.getCompany_email(),
        estudianteJpa.getPersonal_email(),
        estudianteJpa.getCity(),
        estudianteJpa.getNum_hours_week(),
        estudianteJpa.getComments(),
        estudianteJpa.getBranch(),
        estudianteJpa.isActive(),
        estudianteJpa.getCreated_date(),
        estudianteJpa.getTermination_date()
        );
        return  estudianteOutputDto;
    }
}
