package mx.edu.utez.RSSS_Vanessa_Miranda_CC7.controller;

import jakarta.validation.Valid;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.controller.dto.OrdenServicioDTO;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.model.Vehiculo;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.repository.VehiculoRepository;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.service.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controlador")
@CrossOrigin("{*}")
public class MyController {
    //Inyeccion
    private MyService service;
    public MyController(MyService service){
        this.service = service;
    }
    @PostMapping("/crearservicio")
    public ResponseEntity<Vehiculo> crear(@RequestBody @Valid OrdenServicioDTO payload) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(MyService.crear(payload));
    }

}
