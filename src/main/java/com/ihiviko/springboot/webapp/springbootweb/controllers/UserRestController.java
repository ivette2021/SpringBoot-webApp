package com.ihiviko.springboot.webapp.springbootweb.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihiviko.springboot.webapp.springbootweb.models.User;
import com.ihiviko.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;


//este esta basado en la clase usercontroller

@RestController // podemos llamar @Controller en ves de restController pero hay que añadir linea
                // 16 @response Body
                // esta ultima indica que la respuesta va a ser un json

@RequestMapping("/api") // para dar ruta por defecto
public class UserRestController {

    @GetMapping("/details")

    //forma con DTO
    public UserDto details() {
        User user = new User("Ivette", "Valdivia Gomez");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        
        // userDto.setUser(user.getName()); //esto pertenece a si dto tiene un estructura un poco diferente no anidada
        // userDto.setUser(user.lastName());
        //otro ejemplo donde quieres llamar solo el nombre completo de la persona
        //userDto.setName(user.getName().concat(" ").concat(user.getlastName())); //daria json name : "ivette valdivia"
        userDto.setTitle("Hola mundo Spring Boot");

        return userDto;

    }
@GetMapping("/list")
    public List<User> list(){
        User user = new User("Phoebe", "Buffay");
        User user2 = new User("Monica ", "Geller");
        User user3 = new User("Rachel", "Green");

//forma con arraylist es mas larga
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

//forma corta con helper en menos lineas de codigo:
List<User> users = Arrays.asList(user,user2,user3);

        return users;
    }

    // forma antigua
    @GetMapping("/details-Map") // rutas son unicas cambiamos details //aqui tambien podemos cambiar a
                                // @RequestMapping(path ="/api",method = RequestMethod.GET)
    // @ResponseBody
    public Map<String, Object> detailsMap() { // se cambia porque body es del tipo map
        User user = new User("Ivette", "Valdivia Gomez");
        Map<String, Object> body = new HashMap<>(); // nuestro map va a ser nuestro JSON

        body.put("title", "Hola mundo Spring Boot"); // nombre , valor
        body.put("user", user);

        return body;

    }

}
