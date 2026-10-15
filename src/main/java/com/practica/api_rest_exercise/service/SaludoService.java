package com.practica.api_rest_exercise.service;

// Ejercicio 1: Interfaz Funcional Propia

// Crea una interfaz funcional llamada "Saludo" con un metodo "String generarMensaje(String nombre);".
// En tu Main, crea una variable de tipo Saludo usando una expresion Lambda que genere el mensaje: "Bienvenido, [nombre]!".
// Llama al metodo pasando tu nombre e imprime el resultado.

public interface SaludoService {
    String generarMensaje(String nombre);
}
