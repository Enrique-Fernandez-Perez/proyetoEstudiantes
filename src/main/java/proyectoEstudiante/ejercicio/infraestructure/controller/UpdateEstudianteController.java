package proyectoEstudiante.ejercicio.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectoEstudiante.ejercicio.Exceptions.UpdateErrorException;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.input.EstudianteInputDto;
import proyectoEstudiante.ejercicio.infraestructure.controller.dto.output.EstudianteOutputDto;
import proyectoEstudiante.ejercicio.infraestructure.repository.UpdateEstudiantePortRepository;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin("*")
public class UpdateEstudianteController {
    @Autowired
    UpdateEstudiantePortRepository updateEstudiantePortRepository;

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteOutputDto> PutEstudiante(@PathVariable int id, @RequestBody EstudianteInputDto estudianteInputDto) throws UpdateErrorException {

        try{
            updateEstudiantePortRepository.updateEstudiante(id,estudianteInputDto);
            return  ResponseEntity.accepted().build();
        } catch (Exception e){
            return ResponseEntity.status(404).build();
        }



    }

}
