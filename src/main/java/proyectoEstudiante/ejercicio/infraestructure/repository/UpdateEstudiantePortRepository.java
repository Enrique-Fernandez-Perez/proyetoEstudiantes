package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import proyectoEstudiante.ejercicio.Exceptions.UpdateErrorException;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.UpdateEstudiantePort;

import java.util.List;

public class UpdateEstudiantePortRepository implements UpdateEstudiantePort {

    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;

    @Override
    public EstudianteOutputDto updateEstudiante(int id, EstudianteInputDto estudianteInputDto) throws UpdateErrorException {
        return estudianteJpaRepository.findById(id).map(estudianteJpa -> {

                   List<String> msgError = estudianteInputDto.dtoInputComprobador(estudianteInputDto);
                    boolean comprobadorFechas = estudianteInputDto.comprobadorFechas(estudianteInputDto);
                    if (comprobadorFechas == true|| msgError !=null){
                        try {
                            throw new UpdateErrorException("Campos que contienen errores");
                        } catch (UpdateErrorException e) {
                            e.printStackTrace();
                        }
                    }



                    estudianteJpa.setName(estudianteInputDto.getName());
                    estudianteJpa.setSurname(estudianteInputDto.getSurname());
                    estudianteJpa.setCompany_email(estudianteInputDto.getCompany_email());
                    estudianteJpa.setPersonal_email(estudianteInputDto.getPersonal_email());
                    estudianteJpa.setActive(estudianteInputDto.isActive());
                    estudianteJpa.setTermination_date(estudianteInputDto.getTermination_date());
                    estudianteJpa.setCreated_date(estudianteInputDto.getCreated_date());
                    estudianteJpa.setBranch(estudianteInputDto.getBranch());
                    estudianteJpa.setComments(estudianteInputDto.getComments());
                    estudianteJpa.setCity(estudianteInputDto.getCity());
                    estudianteJpa.setNum_hours_week(estudianteInputDto.getNum_hours_week());


                    estudianteJpaRepository.save(estudianteJpa);

                    EstudianteOutputDto estudianteOutputDto = new EstudianteOutputDto(
                            estudianteJpa.getName(),
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
                    return estudianteOutputDto;

                }
        ).orElseThrow(() -> new UpdateErrorException("Error al actualizar un estudiante."));
    }
}

