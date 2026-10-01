package com.example.sportapp;

import com.example.sportapp.models.User;
import com.example.sportapp.services.UserService;
import com.example.sportapp.models.Activity;
import com.example.sportapp.services.ActivityService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SportappApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private ActivityService activityService;

    @Test
    void contextLoads() {
        assertThat(userService).isNotNull();
        assertThat(activityService).isNotNull();
    }

    @Test
    void testInscriptionUtilisateur() {
        User user = new User();
        user.setNom("Testeur");
        user.setPrenom("JUnit");
        user.setEmail("junit@test.com");
        user.setMotDePasse("pass123");
        user.setAge(30);
        user.setGenre("Homme");
        user.setPathologie("Aucune");

        User inscrit = userService.inscrire(user);

        assertThat(inscrit.getId()).isNotNull();
        assertThat(inscrit.getEmail()).isEqualTo("junit@test.com");
    }

    @Test
    void testConnexionUtilisateur() {
        Optional<User> user = userService.connecter("junit@test.com", "pass123");
        assertThat(user.isPresent()).isTrue();
    }

    @Test
    void testAjouterActivite() {
        Activity activity = new Activity();
        activity.setNom("Yoga doux");
        activity.setDescription("Yoga adapté aux débutants");
        activity.setDiscipline("Yoga");
        activity.setUrl("http://yoga-doux.example.com");
        activity.setLatitude(47.0);
        activity.setLongitude(2.0);
        activity.setAdresse("123 rue du Yoga");

        Activity saved = activityService.saveActivity(activity);

        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getNom()).isEqualTo("Yoga doux");
    }

    @Test
    void testListerActivites() {
        List<Activity> activities = activityService.getAllActivities();
        assertThat(activities).isNotEmpty();
    }
}
