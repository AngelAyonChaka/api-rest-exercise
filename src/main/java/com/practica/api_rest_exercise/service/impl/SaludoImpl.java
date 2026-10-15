package com.practica.api_rest_exercise.service.impl;

import org.springframework.stereotype.Service;

import com.practica.api_rest_exercise.service.SaludoService;

@Service 
public class SaludoImpl implements SaludoService {
    @Override
    public String generarMensaje(String nombre) {
        return "Bienvenido, " + nombre + "!";
    }
}
