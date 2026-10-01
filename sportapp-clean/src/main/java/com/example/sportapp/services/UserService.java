// ======= Fichier : UserService.java (Emplacement: src/main/java/com/example/sportapp/services/) =======
package com.example.sportapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sportapp.models.User;
import com.example.sportapp.repositories.UserRepository;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User inscrire(User user) {
        return userRepository.save(user);
    }

    public Optional<User> connecter(String email, String motDePasse) {
        return userRepository.findByEmailAndMotDePasse(email, motDePasse);
    }
}