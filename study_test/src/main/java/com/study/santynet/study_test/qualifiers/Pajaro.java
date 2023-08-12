package com.study.santynet.study_test.qualifiers;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Clase que representa a un pájaro que puede volar.
 */
@Component("pajaro")
public class Pajaro extends Animal implements Volador {

    /**
     * Instancia de la interfaz Volador que se utiliza para imprimir mensajes en la consola.
     */
    Volador vol = System.out::println;  

    /**
     * Constructor de la clase Pajaro.
     * @param nombre El nombre del pájaro.
     * @param edad La edad del pájaro.
     */
    public Pajaro(@Value("Loro") String nombre, @Value("12") String edad) {
        super(nombre,edad);       
    }

    /**
     * Método que implementa el método de la interfaz Volador.
     * Utiliza la instancia de Volador para imprimir un mensaje en la consola.
     * @param message El mensaje que se va a imprimir en la consola.
     */
    @Override
    public void volar(String message) {
        vol.volar(message);
    }

}

