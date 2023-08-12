package com.study.santynet.study_test.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class Avion implements Volador {

    Volador vol = System.out::println;

    @Override
    public void volar(String message) {
        vol.volar(message);
    }
    
}
