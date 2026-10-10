package com.practica.api_rest_exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.api_rest_exercise.dtos.SaludoResponse;

@RestController
@RequestMapping("/api")
public class SaludoController {

@GetMapping("/saludo-objeto")
public SaludoResponse saludarConObjeto() {
// Instanciamos el record (como vimos en el Tema 5, con "new")
return new SaludoResponse("Hola desde un Record", "Tu nombre aqui");
}
}