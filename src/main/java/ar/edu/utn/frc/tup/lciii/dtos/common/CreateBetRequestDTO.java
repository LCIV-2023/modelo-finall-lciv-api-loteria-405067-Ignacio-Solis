package ar.edu.utn.frc.tup.lciii.dtos.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateBetRequestDTO {
    private String fecha_sorteo;
    private Long id_cliente;
    private int numero;
    private int montoApostado;
}
