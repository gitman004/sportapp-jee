// ======= Fichier : Pathologie.java (Emplacement: src/main/java/com/example/sportapp/models/) =======
package com.example.sportapp.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pathologie")
public class Pathologie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToMany(mappedBy = "pathologies")
    private Set<Activity> activities;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Set<Activity> getActivities() { return activities; }
    public void setActivities(Set<Activity> activities) { this.activities = activities; }
}
