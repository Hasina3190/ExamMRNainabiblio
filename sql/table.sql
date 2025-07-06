CREATE DATABASE exambiblio;
use exambiblio;

CREATE TABLE bibliothecaire (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    mot_de_passe VARCHAR(255)
);
CREATE TABLE type_adherant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE adherant (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100),
    email VARCHAR(100) UNIQUE NOT NULL,
    adresse VARCHAR(255),
    telephone VARCHAR(20),
    mot_de_passe VARCHAR(255) NOT NULL,
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES type_adherant(id)
);

CREATE TABLE abonnement (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    date_debut DATE NOT NULL,
    date_fin DATE NOT NULL,
    adherant_id BIGINT NOT NULL,
    FOREIGN KEY (adherant_id) REFERENCES adherant(id)
);

--**
CREATE TABLE genre (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE livre (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(255) NOT NULL,
    auteur VARCHAR(255),
    langue VARCHAR(100),
    accessibilite INT,
    annee_publication INT,
    genre_id BIGINT,
    FOREIGN KEY (genre_id) REFERENCES genre(id)
);


CREATE TABLE exemplaire (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero_exemplaire VARCHAR(100) UNIQUE NOT NULL,
    etat VARCHAR(100),
    disponible BOOLEAN DEFAULT TRUE,
    livre_id BIGINT NOT NULL,
    FOREIGN KEY (livre_id) REFERENCES livre(id)
);

---
CREATE TABLE penaliter (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    adherant_id BIGINT NOT NULL,
    nombre_jour INT NOT NULL,
    FOREIGN KEY (adherant_id) REFERENCES adherant(id)
);

----
CREATE TABLE pret (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    adherant_id BIGINT NOT NULL,
    exemplaire_id BIGINT NOT NULL,
    date_pret DATE NOT NULL,
    date_retour DATE NOT NULL,
    date_effective_retour DATE,
    FOREIGN KEY (adherant_id) REFERENCES adherant(id),
    FOREIGN KEY (exemplaire_id) REFERENCES exemplaire(id)
);

CREATE TABLE rendu (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    pret_id BIGINT NOT NULL,
    date_rendu DATE NOT NULL,

    FOREIGN KEY (pret_id) REFERENCES pret(id)
);
