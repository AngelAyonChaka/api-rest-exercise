package com.practica.api_rest_exercise.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.practica.api_rest_exercise.service.NumerosService;

@Service
public class NumerosImpl implements NumerosService {
    @Override
    public List<Integer> filtrarPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
    }
}
