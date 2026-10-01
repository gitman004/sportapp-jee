// ======= Fichier : UserRepository.java (Emplacement: src/main/java/com/example/sportapp/repositories/) =======
package com.example.sportapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sportapp.models.User;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndMotDePasse(String email, String motDePasse);
}
