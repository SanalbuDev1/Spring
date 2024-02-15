package com.study.springmv.sdt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.study.springmv.sdt.dto.Persona;

/**
 * PersonaService is a Spring service class that handles the business logic
 * related to Personas.
 * It might interact with repositories to retrieve and store data, for example.
 * 
 * Annotations:
 * 
 * @Service - This annotation is a specialization of the component annotation.
 *          It allows Spring to automatically detect and instantiate this class
 *          as a service during component scanning.
 */
@Service
public class PersonaService {

    public static List<Persona> personas = new ArrayList<>();

    RestTemplate restTemplate = new RestTemplate();

    private static final String CONSTANTE_URI = "http://localhost:8082/api";

    public List<Persona> getPersonas() {
        ResponseEntity<List<Persona>> respuesta = restTemplate.exchange(CONSTANTE_URI + "/personas",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Persona>>() {
                });

        List<Persona> personas = respuesta.getBody();
        return personas;
    }

    public void insertAndUpdatePersona(Persona persona) {
        HttpEntity<Persona> request = new HttpEntity<>(persona);
        // restTemplate.postForObject(CONSTANTE_URI + "/personas/insertar", request,
        // Persona.class);
        ResponseEntity<String> response = restTemplate.postForEntity(CONSTANTE_URI + "/personas/insertar", request,
                String.class);
        System.out.println("Respuesta ------------------------------------------------------------------");
        System.out.println(response.getBody());
    }

    public void deletePersona(Persona persona) {
        HttpEntity<Persona> request = new HttpEntity<>(persona);
        ResponseEntity<String> response = restTemplate.postForEntity(CONSTANTE_URI + "/personas/eliminar2", request,
                String.class);
        System.out.println("Respuesta ------------------------------------------------------------------");
        System.out.println(response.getBody());
    }

}
