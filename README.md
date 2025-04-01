# E-Bank Application

Application bancaire développée avec Spring Boot.

## Prérequis

- Java 17
- Maven 3.9+
- MySQL 8.0
- Git

## Installation

1. Cloner le projet :
```bash
git clone https://github.com/boubacar2411/ebank-ci-cd.git
cd ebank-ci-cd
```

2. Configurer la base de données :
- Créer une base de données MySQL nommée `ebank`
- Configurer les identifiants dans le fichier `.env`

3. Compiler le projet :
```bash
mvn clean install -DskipTests
```

4. Démarrer l'application :
- Windows : Double-cliquer sur `start.bat`
- Linux/Mac : `./mvnw spring-boot:run`

## Configuration

Les variables d'environnement peuvent être configurées dans le fichier `.env` :
- `SPRING_DATASOURCE_URL` : URL de la base de données
- `SPRING_DATASOURCE_USERNAME` : Nom d'utilisateur MySQL
- `SPRING_DATASOURCE_PASSWORD` : Mot de passe MySQL
- `JWT_SECRET` : Clé secrète pour les tokens JWT
- `JWT_EXPIRATION` : Durée de validité des tokens (en ms)

## Tests

Pour exécuter les tests :
```bash
mvn test
```

## Structure du projet

```
src/
├── main/
│   ├── java/
│   │   └── sn/
│   │       └── app/
│   │           └── ebank/
│   │               ├── config/
│   │               ├── controller/
│   │               ├── entity/
│   │               ├── repository/
│   │               ├── service/
│   │               └── EbankApplication.java
│   └── resources/
│       └── application.yml
└── test/
    └── java/
        └── sn/
            └── app/
                └── ebank/
```

## Technologies utilisées

- Spring Boot 3.4.4
- Spring Security avec JWT
- Spring Data JPA
- MySQL
- Maven
- JUnit 5 