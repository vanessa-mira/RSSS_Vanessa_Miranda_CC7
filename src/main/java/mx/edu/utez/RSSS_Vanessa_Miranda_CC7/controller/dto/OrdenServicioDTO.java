package mx.edu.utez.RSSS_Vanessa_Miranda_CC7.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.model.tipoServicio;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrdenServicioDTO {
    @NotNull(message = "El id del vehiculo es obligatorio ")
    private Long id;

    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;

    @NotBlank(message = "El tipo de servicio es obligatorio")
    private tipoServicio tipo;
    @PositiveOrZero(message = "El costo debe ser mayor a 0")
    private int costo;
}
