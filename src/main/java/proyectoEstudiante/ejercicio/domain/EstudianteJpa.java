package proyectoEstudiante.ejercicio.domain;


import lombok.*;

import javax.persistence.*;

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
    private double numHorasSemanales;
    @Column
    private String especialidad;
    @Column
    private String estado;


    public EstudianteJpa(String nombre, String apellidos, String email, double numHorasSemanales, String especialidad, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.numHorasSemanales = numHorasSemanales;
        this.especialidad = especialidad;
        this.estado = estado;
    }
}
