package com.ihiviko.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihiviko.springboot.webapp.springbootweb.models.User;

import org.springframework.web.bind.annotation.RequestMapping;



//este esta basado en la clase usercontroller

@RestController //podemos llamar @Controller en ves de restController pero hay que añadir linea 16 @response Body 
                // esta ultima indica que la respuesta va a ser un json 


@RequestMapping("/api") //para dar ruta por defecto
public class UserRestController {

    @GetMapping("/details") //rutas son unicas cambiamos details //aqui tambien podemos cambiar a @RequestMapping(path ="/api",method = RequestMethod.GET) 
    //@ResponseBody
    public Map<String, Object>details() {  //se cambia porque body es del tipo map
        User user = new User("Ivette", "Valdivia Gomez");
        Map<String, Object> body = new HashMap<>(); //nuestro map va a ser nuestro JSON

        body.put("title", "Hola mundo Spring Boot"); // nombre , valor
        body.put("user", user);

        return body;

    }

}
