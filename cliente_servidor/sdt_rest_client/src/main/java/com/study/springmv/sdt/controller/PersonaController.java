package com.study.springmv.sdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springmv.sdt.dto.Persona;
import com.study.springmv.sdt.services.PersonaService;

import jakarta.servlet.http.HttpServletRequest;

/**
 * PersonaController is a Spring MVC Controller that handles HTTP requests
 * related to Personas.
 * It uses the PersonaService to retrieve data and add it to the Model, which is
 * then used to render views.
 * 
 * Annotations:
 * 
 * @Controller - This annotation indicates that the class serves the role of a
 *             controller.
 *             Spring MVC scans the classes annotated with @Controller and
 *             detects @RequestMapping annotations within them.
 *             @RequestMapping("/personas") - This annotation maps HTTP requests
 *             to handler methods of MVC and REST controllers.
 *             In this case, it's applied at the class level, so it's used as a
 *             base path for all methods in this controller.
 */
@Controller
@RequestMapping("/personas")
public class PersonaController {

    /**
     * The PersonaService instance is automatically injected by Spring.
     * 
     * @Autowired - This annotation allows Spring to resolve and inject
     *            collaborating beans into our bean.
     *            Here it's used to automatically inject an instance of
     *            PersonaService.
     */
    /*
     * @Autowired
     * PersonaService personaService;
     */

    @Autowired
    PersonaService personaServiceJPA;

    /**
     * This method is used to get a list of persons and add it to the model.
     * 
     * @param model The model to which the list of persons is to be added.
     * @return The view that will display the list of persons.
     */

    @RequestMapping("/lista")
    public String getPersonaService(Model model, HttpServletRequest request) {
        // model.addAttribute("personas", personaService.getPersonas()); jdbc
        model.addAttribute("personas", personaServiceJPA.getPersonas());
        model.addAttribute("request", request);
        return "personas/lista.html";
    }

    @RequestMapping("/formularioInsert")
    public String formInsert(Model model) {
        model.addAttribute("persona", new Persona());
        return "personas/forminsert.html";
    }

    @RequestMapping("/insertar")
    public String formInsertar(Persona persona, Model model, HttpServletRequest request) {
        Persona personaDto = persona;
        personaServiceJPA.insertAndUpdatePersona(personaDto);
        model.addAttribute("personas", personaServiceJPA.getPersonas());
        model.addAttribute("request", request);

        return "personas/lista";
    }

    @RequestMapping("/borrar")
    public String borrar(@RequestParam("tipoDocumento") String tipo, @RequestParam("documento") String numero,
            Model model, HttpServletRequest request) {
        Persona persona = new Persona();
        persona.setTipoDocumento(tipo);
        persona.setDocumento(numero);
        personaServiceJPA.deletePersona(persona);
        model.addAttribute("personas", personaServiceJPA.getPersonas());
        model.addAttribute("request", request);
        return "personas/lista";
    }
}
