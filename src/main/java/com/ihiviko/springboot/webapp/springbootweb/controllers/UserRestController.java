package com.ihiviko.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //este esta basado en la clase usercontroller
public class UserRestController {

    @GetMapping("/details2") //rutas son unicas cambiamos details
    public Map<String, Object>details() {  //se cambia porque body es del tipo map
        Map<String, Object> body = new HashMap<>(); //nuestro map va a ser nuestro JSON

        body.put("title", "Hola mundo Spring Boot"); // nombre , valor
        body.put("name", "Ivette");
        body.put("lastname", "Valdivia Gomez");

        return body;

    }

}
