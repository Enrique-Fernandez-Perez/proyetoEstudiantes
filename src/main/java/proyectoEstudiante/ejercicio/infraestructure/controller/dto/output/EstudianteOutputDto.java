package proyectoEstudiante.ejercicio.infraestructure.controller.dto.output;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EstudianteOutputDto {
    private String nombre;

    private String apellidos;

    private String email;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate fechaEntrada;

    private String ciudad;
    private double numHorasSemanales;

    private String especialidad;

    private String estado;


}
