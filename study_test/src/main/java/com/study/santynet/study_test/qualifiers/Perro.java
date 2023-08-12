package com.study.santynet.study_test.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {
    
    public Perro(@Value("Perro") String nombre, @Value("15") String edad) {
        super(nombre,edad);       
    }  
  
}
