package proyectoEstudiante.ejercicio.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteJpa {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_estudiante")
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String email;
    @Column
    @JsonFormat(pattern="MM/dd/yyyy")
    private LocalDate fechaEntrada;

    @Column
    private String ciudad;
    @Column
    private double numHorasSemanales;
    @Column
    private String especialidad;
    @Column
    private String estado;


    public EstudianteJpa(String nombre, String apellidos, String email, LocalDate fechaEntrada, String ciudad, double numHorasSemanales, String especialidad, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaEntrada = fechaEntrada;
        this.ciudad = ciudad;
        this.numHorasSemanales = numHorasSemanales;
        this.especialidad = especialidad;
        this.estado = estado;
    }
}
