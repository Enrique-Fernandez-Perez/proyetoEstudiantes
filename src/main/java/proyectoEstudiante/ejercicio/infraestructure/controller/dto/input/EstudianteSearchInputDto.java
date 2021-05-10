package proyectoEstudiante.ejercicio.infraestructure.controller.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteSearchInputDto {

    private String nombre;

    private String apellidos;

    private String email;

    @JsonFormat(pattern="MM/dd/yyyy")
    private LocalDate fechaEntrada;

    private String ciudad;

    private double numHorasSemanales;

    private String especialidad;

    private String estado;




    public EstudianteSearchInputDto dtoInputComprobador(EstudianteSearchInputDto e) {

        if (e == null)
            return null;
        if (e.nombre.matches("^[0-9]+$")) {
            e.setNombre("Nombre invalido");
        }
        if(e.nombre == null)
            e.setNombre("nombre vacio");
        System.out.println();
        if (e.apellidos.matches("^[0-9]+$")) {
            e.setApellidos("Apellidos invalidos");
        }
        if(e.apellidos == null)
            e.setApellidos("apellidos vacio");

        if(e.email == null)
            e.setEmail("email vacio");

        if (e.ciudad.matches("^[0-9]+$")) {
            e.setApellidos("Ciudad Invalida");
        }
        if(e.ciudad == null)
            e.setApellidos("Ciudad vacia");

        if(e.numHorasSemanales < 0 || e.numHorasSemanales > 40 || Double.isNaN(e.numHorasSemanales))
            e.setNumHorasSemanales(0);



        if (
                e.especialidad.equalsIgnoreCase("front")   ||
                e.especialidad.equalsIgnoreCase("back" )
        ){}else e.setEspecialidad("Especialidad sin definir");



        if (e.getEstado().equalsIgnoreCase("activo") ||
                e.getEstado().equalsIgnoreCase("inactivo")
        ){}else e.setEstado("Estado sin definir");


        return  e;
    }
}