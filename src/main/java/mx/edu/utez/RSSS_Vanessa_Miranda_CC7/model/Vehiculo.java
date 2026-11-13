package mx.edu.utez.RSSS_Vanessa_Miranda_CC7.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.controller.dto.OrdenServicioDTO;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int placa;
    private String marca;
    private int modelo;
    private String propietario;
    private boolean activo;


}
