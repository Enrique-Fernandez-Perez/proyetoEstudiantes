package proyectoEstudiante.ejercicio.infraestructure.controller.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class EstudianteInputDto {

    private String nombre;

    private String apellidos;

    private String email;

    private double numHorasSemanales;

    private String especialidad;

    private String estado;




    public EstudianteInputDto dtoInputComprobador(EstudianteInputDto e) {

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