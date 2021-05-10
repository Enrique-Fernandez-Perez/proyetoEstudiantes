package proyectoEstudiante.ejercicio.infraestructure.controller.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyectoEstudiante.ejercicio.domain.branch;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteSearchInputDto {

    private String name;

    private String Surname;

    private String company_email;

    private String personal_email;

    private String city;

    private int num_hours_week;

    private String comments;

    private proyectoEstudiante.ejercicio.domain.branch branch;

    private boolean active;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date created_date;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date termination_date;
}