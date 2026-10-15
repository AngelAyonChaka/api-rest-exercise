package com.practica.api_rest_exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.api_rest_exercise.dtos.SaludoResponse;
import com.practica.api_rest_exercise.service.SaludoService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludo-objeto")
    public SaludoResponse saludarConObjeto() {
        // Instanciamos el record (como vimos en el Tema 5, con "new")
        return new SaludoResponse("Hola desde un Record", "Tu nombre aqui");
    }

    @GetMapping("/saludo-serviceImpl")
    public String saludarConServiceImpl(@RequestParam String nombre) {
        return saludoService.generarMensaje(nombre);
    }
    
}