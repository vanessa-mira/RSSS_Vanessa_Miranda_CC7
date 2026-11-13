package mx.edu.utez.RSSS_Vanessa_Miranda_CC7.service;

import jakarta.validation.Valid;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.Exception.CustomException;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.controller.dto.OrdenServicioDTO;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.model.Vehiculo;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.repository.OrdenServicioRepository;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.repository.VehiculoRepository;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class MyService {
    //Inyecciones

    private OrdenServicioRepository ordenServicioRepository;

    public MyService(OrdenServicioRepository ordenServicioRepository) {
        this.ordenServicioRepository = ordenServicioRepository;
    }

    private VehiculoRepository vehiculoRepository;

    public MyService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }
@
    public static Vehiculo crear(@Valid OrdenServicioDTO payload) {
        Vehiculo nuevoservicio = new Vehiculo();
        nuevoservicio.setId(payload.getId());
        return nuevoservicio;

        if (!VehiculoRepository.existsById(id)) {
            throw new CustomException("El vehiculo no existe ");
        }
    }


}

