package proyectoEstudiante.ejercicio.infraestructure.controller.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudianteOutputDto {
    private String nombre;

    private String apellidos;

    private String email;

    private double numHorasSemanales;

    private String especialidad;

    private String estado;


}
