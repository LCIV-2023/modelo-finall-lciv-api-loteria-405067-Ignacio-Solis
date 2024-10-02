package ar.edu.utn.frc.tup.lciii.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;

import ar.edu.utn.frc.tup.lciii.dtos.common.CreateBetRequestDTO;
import ar.edu.utn.frc.tup.lciii.dtos.common.SorteoDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


import java.net.URI;

import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class ApuestaController {

    RestTemplate restTemplate = new RestTemplate();
    ModelMapper mapper = new ModelMapper();


    @PostMapping("/loteria/apuesta")
    public int postApuesta(@RequestBody CreateBetRequestDTO dto) {
        //get all raffles where date matches CreateBetRequestDTO date
        String rafflesUrl = "/ping";
        // rafflesUrl = UriComponentsBuilder.fromUriString(rafflesUrl).toUriString();
        // Mono<Object[]> response = client.get().uri(rafflesUrl).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(Object[].class);
        // Object[] sorteos = response.block();

        //String response = client.get().uri(rafflesUrl).retrieve().bodyToMono(String.class).block();
        return dto.getMontoApostado();
        
    }


    @GetMapping("/pingTest")
    public String pingTest() {
        String response = restTemplate.getForEntity("http://localhost:8080/ping", String.class).getBody();
        return response;
    }
    
}
