package com.study.santynet.study_test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.study.santynet.study_test.qualifiers.Pajaro;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = {Pajaro.class})
public class PajaroTest {

    @Autowired
    private Pajaro pajaro;

    @Test
    public void testNombre() {
        assertEquals("Loro", pajaro.getNombre());
    }

    @Test
    public void testEdad() {
        assertEquals("12", pajaro.getEdad());
    }

    @Test
    public void testVolar() {
        pajaro.volar("Volando");
    }
}