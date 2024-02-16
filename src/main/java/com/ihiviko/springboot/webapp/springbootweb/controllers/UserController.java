package com.ihiviko.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) { // primera forma con Model de pasar datos a la vista
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Ivette");
        model.addAttribute("lastname", "Valdivia Gomez");

        /*
         * public String details(Map<String, Object> model){ //segunda forma con MAp
         * forma de pasar datos a la vista
         * model.put("title","Hola mundo Spring Boot");
         * model.put("name","Ivette");
         * model.put("lastname","Valdivia Gomez");
         */

        return "details";

    }

}
