package proyectoEstudiante.ejercicio.infraestructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectoEstudiante.ejercicio.domain.EstudianteJpa;

public interface EstudianteJpaRepository extends JpaRepository<EstudianteJpa,Integer> {
}
