package proyectoEstudiante.ejercicio.infraestructure.controller.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyectoEstudiante.ejercicio.domain.branch;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteInputDto {

    private String name;

    private String Surname;

    private String company_email;

    private String personal_email;

    private String city;

    private int num_hours_week;

    private String comments;

    private branch branch;

    private boolean active;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date created_date;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date termination_date;




    public EstudianteInputDto dtoInputComprobador(EstudianteInputDto e) {

        return  e;
    }
}