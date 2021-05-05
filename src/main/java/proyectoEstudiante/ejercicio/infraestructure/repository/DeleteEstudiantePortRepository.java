package proyectoEstudiante.ejercicio.infraestructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import proyectoEstudiante.ejercicio.infraestructure.repository.jpa.EstudianteJpaRepository;
import proyectoEstudiante.ejercicio.infraestructure.repository.portOservicio.DeleteEstudiantePort;

@Component
public class DeleteEstudiantePortRepository  implements DeleteEstudiantePort {

    @Autowired
    EstudianteJpaRepository estudianteJpaRepository;

    @Override
    public void deleteEstudianteById(int id) {
        estudianteJpaRepository.deleteById(id);
    }
}
