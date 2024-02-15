package com.study.springmv.sdt.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springmv.sdt.dto.Persona;
import com.study.springmv.sdt.services.PersonaServicesJPA;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

    @Autowired
    PersonaServicesJPA personaServiceJPA;

    @GetMapping("/personas")
    public List<Persona> getMethodName() {
        return personaServiceJPA.getPersonas();
    }

    @PostMapping("/personas/insertar")
    public ResponseEntity<String> postMethodName(@RequestBody Persona entity) {
        personaServiceJPA.insertPersona(entity);
        return ResponseEntity.ok("Persona insertada");
    }

    @PostMapping("/personas/eliminar")
    public ResponseEntity<String> deleteMethodName(@RequestBody Map<String, String> body) {
        personaServiceJPA.deleteById(body.get("tipoDocumento"), body.get("documento"));
        return ResponseEntity.ok("Persona eliminada");
    }

    @PostMapping("/personas/eliminar2")
    public ResponseEntity<String> deleteMethodName(@RequestBody Persona entity) {
        personaServiceJPA.deletePersona(entity);
        return ResponseEntity.ok("Persona eliminada");
    }

}
