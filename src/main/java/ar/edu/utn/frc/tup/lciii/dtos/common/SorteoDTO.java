package ar.edu.utn.frc.tup.lciii.dtos.common;

import java.util.HashMap;

import lombok.Data;


@Data
public class SorteoDTO {

    private int numeroSorteo;
    private String fecha;
    private float dineroTotalAcumulado;
    private HashMap<Integer,Integer> hashMap;


}
