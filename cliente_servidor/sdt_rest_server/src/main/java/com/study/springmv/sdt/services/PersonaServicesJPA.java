package com.study.springmv.sdt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springmv.sdt.dao.PersonaRepositoryJPA;
import com.study.springmv.sdt.dto.Persona;

@Service
public class PersonaServicesJPA {

    public static List<Persona> personas = new ArrayList<>();

    @Autowired
    PersonaRepositoryJPA personaRepository;

    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    public void insertPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void updatePersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void deletePersona(Persona persona) {
        personaRepository.delete(persona);
    }

    public void deleteById(String tipoDocumento, String documento) {
        personaRepository.deleteBytipoDocumentoAndDocumento(tipoDocumento, documento);
    }

    public Persona getPersona(String tipoDocumento, String documento) {
        return personaRepository.findBy(null, null);
    }

}
