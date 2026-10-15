package com.practica.api_rest_exercise.dtos;

// Con esta sola linea, Java crea automaticamente:
// - El constructor
// - Los metodos para obtener los valores (como getters)
public record SaludoResponse(String mensaje, String autor) {   
}