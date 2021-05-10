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

        estudianteJpa.setSurname(estudianteInputDto.getSurname());
        estudianteJpa.setCompany_email(estudianteInputDto.getCompany_email());
        estudianteJpa.setPersonal_email(estudianteInputDto.getPersonal_email());
        estudianteJpa.setCity(estudianteInputDto.getCity());
        estudianteJpa.setNum_hours_week(estudianteInputDto.getNum_hours_week());
        estudianteJpa.setComments(estudianteInputDto.getComments());
        estudianteJpa.setBranch(estudianteInputDto.getBranch());
        estudianteJpa.setActive(estudianteInputDto.isActive());
        estudianteJpa.setCreated_date(estudianteInputDto.getCreated_date());
        estudianteJpa.setTermination_date(estudianteInputDto.getTermination_date());


        estudianteJpaRepository.save(estudianteJpa);
    }
}
