# Sportapp — Recommandation d'activités physiques adaptées

Application Spring Boot de gestion d'activités sportives recommandées selon la pathologie de l'utilisateur, développée dans le cadre d'un projet académique (JEE).

## Fonctionnalités

- Gestion des utilisateurs (inscription, profil avec pathologie associée)
- Catalogue d'activités physiques, géolocalisées (latitude/longitude, adresse)
- Association many-to-many entre activités et pathologies, pour ne recommander que des activités adaptées à chaque profil
- Authentification sécurisée par JWT (Spring Security)

## Stack technique

- Java, Spring Boot 3.4
- Spring Data JPA + MariaDB
- Spring Security + JJWT (JSON Web Tokens)
- Maven

## Structure

```
src/main/java/com/example/sportapp/
├── controllers/   # UserController, ActivityController
├── services/       # UserService, ActivityService
├── repositories/    # UserRepository, ActivityRepository
├── models/          # User, Activity, Pathologie
└── config/          # SecurityConfig
```

## Lancer le projet

```bash
mvn spring-boot:run
```

Nécessite une base MariaDB locale ; configurer la connexion dans `src/main/resources/application.properties`.

## Contexte

Projet réalisé en Master, pour pratiquer la conception d'une API REST sécurisée avec une modélisation relationnelle many-to-many (activités ↔ pathologies).
