package proyectoEstudiante.ejercicio.infraestructure.controller.dto.output;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import proyectoEstudiante.ejercicio.domain.branch;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class EstudianteOutputDto {
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

    public EstudianteOutputDto(String surname, String company_email, String personal_email, String city, int num_hours_week, String comments, proyectoEstudiante.ejercicio.domain.branch branch, boolean active, Date created_date, Date termination_date) {
        Surname = surname;
        this.company_email = company_email;
        this.personal_email = personal_email;
        this.city = city;
        this.num_hours_week = num_hours_week;
        this.comments = comments;
        this.branch = branch;
        this.active = active;
        this.created_date = created_date;
        this.termination_date = termination_date;
    }
}

