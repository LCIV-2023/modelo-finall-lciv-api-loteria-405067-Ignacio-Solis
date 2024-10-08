package ar.edu.utn.frc.tup.lciii.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    private String nombre;
    
}
