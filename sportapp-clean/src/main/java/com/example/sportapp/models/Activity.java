// ======= Fichier : Activity.java (Emplacement: src/main/java/com/example/sportapp/models/) =======
package com.example.sportapp.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity
@Table(name = "activite")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private String discipline;
    private String url;
    private Double latitude;
    private Double longitude;
    private String adresse;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "activite_pathologie",
            joinColumns = @JoinColumn(name = "activite_id"),
            inverseJoinColumns = @JoinColumn(name = "pathologie_id")
    )
    @JsonIgnore
    private Set<Pathologie> pathologies;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDiscipline() { return discipline; }
    public void setDiscipline(String discipline) { this.discipline = discipline; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public Set<Pathologie> getPathologies() { return pathologies; }
    public void setPathologies(Set<Pathologie> pathologies) { this.pathologies = pathologies; }
}
