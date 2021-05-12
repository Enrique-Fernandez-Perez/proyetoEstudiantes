package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import proyectoEstudiante.ejercicio.domain.EstudianteJpa;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.CreateEstudiantePort;

import java.util.List;

@Component
public class CreateEstudiantePortRepositorio implements CreateEstudiantePort {

    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;

    @Override
    public ResponseEntity createEstudiante(EstudianteInputDto estudianteInputDto) {


        List<String> msgError= estudianteInputDto.dtoInputComprobador(estudianteInputDto);
        boolean comprobadorFechas = estudianteInputDto.comprobadorFechas(estudianteInputDto);

        EstudianteJpa estudianteJpa = new EstudianteJpa();

        if (comprobadorFechas == true|| msgError !=null)
            return ResponseEntity.badRequest().body("Error al crear el usuario");
        else {
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

            return ResponseEntity.accepted().body("Creado con exito");
        }
    }
}
