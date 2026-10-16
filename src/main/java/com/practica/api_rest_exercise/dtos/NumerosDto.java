package com.practica.api_rest_exercise.dtos;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NumerosDto(
        @NotEmpty(message = "La lista de numeros no puede estar vacia")
        List<@NotNull(message = "La lista no puede contener valores null") Integer> numeros) {
}
