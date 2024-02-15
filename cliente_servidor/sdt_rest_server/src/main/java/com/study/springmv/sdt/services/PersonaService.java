package com.study.springmv.sdt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springmv.sdt.dao.PersonaRepositoryJDBC;
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

    @Autowired
    PersonaRepositoryJDBC personaRepository;

    public List<Persona> getPersonas() {
        return personaRepository.getPersonas();
    }

    public void insertPersona(Persona persona) {
        personaRepository.insertPersona(persona);
    }

    public void updatePersona(Persona persona) {
        personaRepository.updatePersona(persona);
    }

    public void deletePersona(Persona persona) {
        personaRepository.deletePersona(persona);
    }

    public Persona getPersona(String tipoDocumento, String documento) {
        return personaRepository.getPersona(tipoDocumento, documento);
    }

}
