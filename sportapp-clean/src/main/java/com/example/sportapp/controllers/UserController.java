// ======= Fichier : UserController.java (Emplacement: src/main/java/com/example/sportapp/controllers/) =======
package com.example.sportapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sportapp.models.User;
import com.example.sportapp.services.UserService;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.inscrire(user);
    }

    @PostMapping("/login")
    public Optional<User> loginUser(@RequestParam String email, @RequestParam String motDePasse) {
        return userService.connecter(email, motDePasse);
    }
}