package proyectoEstudiante.ejercicio.infraestructure.controller.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;

import javax.persistence.Column;

@Data
@AllArgsConstructor
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
        if (!e.nombre.matches("^[0-9]+$")) {
            e.setNombre("Nombre invalido");
        }
        if(e.nombre == null)
            e.setNombre("nombre vacio");

        if (!e.apellidos.matches("^[0-9]+$")) {
            e.setNombre("Apellidos invalidos");
        }
        if(e.apellidos == null)
            e.setApellidos("apellidos vacio");

        if(e.email == null)
            e.setEmail("email vacio");

        if(e.numHorasSemanales < 0 || e.numHorasSemanales > 40 || Double.isNaN(e.numHorasSemanales))
            e.setNumHorasSemanales(0);

        if (!e.especialidad.equalsIgnoreCase("front") ||
                !e.especialidad.equalsIgnoreCase("back" )
        ||e.especialidad == null)
            e.setEspecialidad("Sin definir");


        if (!e.estado.equalsIgnoreCase("activo") ||
                !e.estado.equalsIgnoreCase("inactivo")
        ||e.estado == null)

            e.setEstado("Sin definir");


        return  e;
    }
}