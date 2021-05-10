package proyectoEstudiante.ejercicio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;


import org.hibernate.annotations.Parameter;
import org.springframework.dao.DataAccessException;
import proyectoEstudiante.ejercicio.infraestructure.configs.StringPrefixedSequenceIdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteJpa {


    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            name = "ausencias_seq",
            strategy = "com.bosonit.staffit.shared.sequences.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
    @Column(name = "id_estudiante")
    private int id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String Surname;

    @Column
    @NotNull
    private String company_email;

    @Column
    @NotNull
    private String personal_email;

    @Column
    @NotNull
    private String city;

    @Column
    @NotNull
    private int num_hours_week;

    @Column
    private String comments;

    @Column
    @NotNull
    private branch branch;

    @Column
    @NotNull
    private boolean active;


    @Column
    @NotNull
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date created_date;

    @Column
    @NotNull
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date termination_date;
}



