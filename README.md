# Vote App Backend

## Description
Vote App Backend est une API REST développée avec **Spring Boot** pour gérer une application de vote. Elle permet de créer des sondages, de consulter les sondages existants, et de voter sur des options spécifiques.

Cette application est connectée à une base de données MySQL pour stocker les données des sondages.

---

## Prérequis
Avant de démarrer, assurez-vous d'avoir installé :
- **Java 17** ou version supérieure
- **Maven** pour la gestion des dépendances
- **MySQL** pour la base de données
- **Docker** (optionnel, pour l'utilisation avec Docker)

---

## Installation et configuration

### 1. Clonez le dépôt
```bash
git clone https://github.com/Alouzou/vote-app-backend.git
cd vote-app-backend
```

### 2. Configurez la base de données
Créez une base de données MySQL nommée voteapp.
- Modifiez les paramètres de connexion dans le fichier src/main/resources/application.properties :
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/voteapp
spring.datasource.username=VOTRE_NOM_UTILISATEUR
spring.datasource.password=VOTRE_MOT_DE_PASSE
spring.jpa.hibernate.ddl-auto=update
```
### 3. Installez les dépendances
Exécutez la commande Maven pour télécharger les dépendances :
```bash
mvn clean install
```
## Lancement de l'application
### 1. Localement avec Maven
```bash
mvn spring-boot:run
```
L'API sera accessible sur http://localhost:8080.

### 2. Avec Docker
Construisez l'image Docker :
```bash
docker build -t vote-app-backend .
```
Démarrez le conteneur :
```bash
docker run -p 8080:8080 vote-app-backend
```
# Points de terminaison principaux (API)

| Méthode | Endpoint              | Description                         |
|---------|-----------------------|-------------------------------------|
| GET     | `/api/polls`          | Récupère tous les sondages          |
| POST    | `/api/polls`          | Crée un nouveau sondage             |
| GET     | `/api/polls/{id}`     | Récupère un sondage par son ID      |
| POST    | `/api/polls/vote`| Vote pour une option d'un sondage   |
