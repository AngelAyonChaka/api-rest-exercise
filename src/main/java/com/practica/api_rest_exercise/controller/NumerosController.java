package com.practica.api_rest_exercise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import com.practica.api_rest_exercise.dtos.NumerosDto;
import com.practica.api_rest_exercise.exception.NoNumerosParesException;
import com.practica.api_rest_exercise.service.NumerosService;

@RestController
@RequestMapping("/api/numeros")
public class NumerosController {

    private final NumerosService numerosService;

    public NumerosController(NumerosService numerosService) {
        this.numerosService = numerosService;
    }

    @PostMapping("/pares")
    public List<Integer> filtra(@Valid @RequestBody NumerosDto numerosDto) {
        List<Integer> numerosPares = numerosService.filtrarPares(numerosDto.numeros());

        if (numerosPares.isEmpty()) {
            throw new NoNumerosParesException();
        }

        return numerosPares;
    }
}
