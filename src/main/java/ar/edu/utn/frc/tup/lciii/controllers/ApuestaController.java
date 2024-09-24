package ar.edu.utn.frc.tup.lciii.controllers;

import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frc.tup.lciii.dtos.common.CreateBetRequestDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApuestaController {

    @PostMapping("/loteria/apuesta")
    public String postApuesta(@RequestParam CreateBetRequestDTO dto) {
        return "endpoint called";
        
    }
    
}
