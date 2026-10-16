package com.practica.api_rest_exercise.exception;

public class NoNumerosParesException extends RuntimeException {
    public NoNumerosParesException() {
        super("La lista debe contener al menos un numero par");
    }
}
