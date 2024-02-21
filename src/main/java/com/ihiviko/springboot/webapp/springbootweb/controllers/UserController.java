package com.ihiviko.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ihiviko.springboot.webapp.springbootweb.models.User;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) { // primera forma con Model de pasar datos a la vista

          User user = new User("Ivette", "Valdivia Gomez");
          user.setEmail("ivette@correo.com");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);

        /*
         * public String details(Map<String, Object> model){ //segunda forma con MAp
         * forma de pasar datos a la vista
         * model.put("title","Hola mundo Spring Boot");
         * model.put("name","Ivette");
         * model.put("lastname","Valdivia Gomez");
         */
        

        return "details";

    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();

        model.addAttribute("users",users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
    





}
