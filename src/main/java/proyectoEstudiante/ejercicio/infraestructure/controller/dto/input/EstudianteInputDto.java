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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteInputDto {

    private String name;

    private String surname;

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




    public List dtoInputComprobador(EstudianteInputDto e) {
        List<String> msgError = new ArrayList<>();
        if (name== null ||
                surname == null ||
                company_email == null ||
                personal_email == null ||
                city == null ||
                comments == null ||
                branch == null ||
                created_date == null ||
                termination_date == null
        )
            msgError.add("-Campos Vacios-");

        if (name.matches("^[0-9]+$") ||
                surname.matches("^[0-9]+$") ||
                city.matches("^[0-9]+$")

        )
            msgError.add("-Campos con caracteres no validos-");

        return  msgError;
    }
}