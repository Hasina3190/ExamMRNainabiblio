use exambiblio;

INSERT INTO type_adherant (libelle) VALUES 
('etudiant'), 
('professeur'), 
('professionnel'), 
('anonyme');

INSERT INTO adherant (nom, prenom, email, adresse, telephone, mot_de_passe, type_id) VALUES
('Randria', 'Hasina', 'hasina.etud@gmail.com', 'Antananarivo', '0341234567', 'motdepasse1', 1),
('Rakoto', 'Jean', 'jean.prof@gmail.com', 'Fianarantsoa', '0329876543', 'motdepasse2', 2),
('Rasolonjatovo', 'Marie', 'marie.pro@gmail.com', 'Toamasina', '0331122334', 'motdepasse3', 3),
('Andrianina', 'Tiana', 'tiana.anon@gmail.com', 'Mahajanga', '0345566778', 'motdepasse4', 4);

---**
INSERT INTO genre (id, libelle) VALUES
(1, 'Informatique'),
(2, 'Roman'),
(3, 'Science'),
(4, 'Mathematiques'),
(5, 'Reseaux'),
(6, 'Securite'),
(7, 'Administration'),
(8, 'Programmation');

INSERT INTO livre (titre, auteur, langue, accessibilite, annee_publication, genre_id) VALUES
('Programmation Java', 'James Gosling', 'Français', 1, 2020, 8),
('Spring Boot Guide', 'Craig Walls', 'Français', 1, 2021, 8),
('POO en Java', 'Alice Durand', 'Français', 1, 2019, 8),
('Microservices', 'Sam Newman', 'Anglais', 2, 2016, 8),
('Python Pro', 'Guido Van Rossum', 'Français', 1, 2022, 8),
('Programmation C++', 'Bjarne Stroustrup', 'Français', 1, 2011, 8),
('TypeScript Guide', 'Anders Hejlsberg', 'Français', 1, 2022, 8),
('Design Patterns', 'Erich Gamma', 'Anglais', 2, 2000, 1),
('Clean Code', 'Robert C. Martin', 'Français', 1, 2008, 1),
('SQL et BDD', 'Philippe Martin', 'Français', 1, 2018, 1),
('Angular pour les nuls', 'Claire Thomas', 'Français', 1, 2021, 1),
('HTML & CSS', 'Mickael Smith', 'Français', 1, 2012, 1),
('Kubernetes en action', 'Pierre Cloud', 'Français', 2, 2023, 1),
('Linux Administration', 'Tux Admin', 'Français', 1, 2013, 1),
('JavaScript Essentiel', 'Brendan Eich', 'Français', 1, 2010, 1),
('ReactJS Avancé', 'Dan Abramov', 'Français', 1, 2021, 1),
('Blockchain Basics', 'Satoshi Nakamoto', 'Français', 2, 2020, 1),
('Structure de Données', 'Jean Dupont', 'Français', 2, 2015, 4),
('Algorithmique', 'Michel Algo', 'Français', 2, 2009, 4),
('Docker Facile', 'Luc Weber', 'Français', 1, 2022, 5),
('Réseaux Informatiques', 'Jean Internet', 'Français', 1, 2014, 5),
('Sécurité Informatique', 'Kevin Mitnick', 'Français', 2, 2015, 6),
('Cybersécurité', 'Edward Snowden', 'Français', 2, 2023, 6),
('Intelligence Artificielle', 'Andrew Ng', 'Français', 1, 2021, 3),
('Machine Learning', 'Yann LeCun', 'Français', 1, 2020, 3),
('Data Science', 'Marie Curie', 'Français', 1, 2022, 3),
('Big Data', 'Alan Turing', 'Français', 2, 2023, 3),
('UML Pratique', 'Grady Booch', 'Français', 2, 2014, 7),
('Systèmes d’exploitation', 'Ada Lovelace', 'Français', 2, 2016, 7),
('DevOps Culture', 'Nathalie Dev', 'Français', 2, 2020, 2);


INSERT INTO exemplaire (numero_exemplaire, etat, disponible, livre_id) VALUES
('EX001-A', 'neuf', TRUE, 1),('EX001-B', 'bon', TRUE, 1),
('EX002-A', 'neuf', TRUE, 2),('EX002-B', 'bon', TRUE, 2),
('EX003-A', 'use', TRUE, 3),('EX003-B', 'bon', TRUE, 3),
('EX004-A', 'neuf', TRUE, 4),('EX004-B', 'neuf', TRUE, 4),
('EX005-A', 'bon', TRUE, 5),('EX005-B', 'bon', TRUE, 5),
('EX006-A', 'use', TRUE, 6),('EX006-B', 'bon', TRUE, 6),
('EX007-A', 'neuf', TRUE, 7),('EX007-B', 'use', TRUE, 7),
('EX008-A', 'bon', TRUE, 8),('EX008-B', 'bon', TRUE, 8),
('EX009-A', 'neuf', TRUE, 9),('EX009-B', 'bon', TRUE, 9),
('EX010-A', 'neuf', TRUE, 10),('EX010-B', 'neuf', TRUE, 10),
('EX011-A', 'neuf', TRUE, 11), ('EX011-B', 'neuf', TRUE, 11),
('EX012-A', 'bon', TRUE, 12), ('EX012-B', 'bon', TRUE, 12),
('EX013-A', 'use', TRUE, 13), ('EX013-B', 'bon', TRUE, 13),
('EX014-A', 'neuf', TRUE, 14), ('EX014-B', 'bon', TRUE, 14),
('EX015-A', 'neuf', TRUE, 15), ('EX015-B', 'bon', TRUE, 15),
('EX016-A', 'neuf', TRUE, 16), ('EX016-B', 'use', TRUE, 16),
('EX017-A', 'bon', TRUE, 17), ('EX017-B', 'bon', TRUE, 17),
('EX018-A', 'use', TRUE, 18), ('EX018-B', 'bon', TRUE, 18),
('EX019-A', 'neuf', TRUE, 19), ('EX019-B', 'bon', TRUE, 19),
('EX020-A', 'bon', TRUE, 20), ('EX020-B', 'use', TRUE, 20),
('EX021-A', 'neuf', TRUE, 21), ('EX021-B', 'bon', TRUE, 21),
('EX022-A', 'bon', TRUE, 22), ('EX022-B', 'use', TRUE, 22),
('EX023-A', 'bon', TRUE, 23), ('EX023-B', 'bon', TRUE, 23),
('EX024-A', 'neuf', TRUE, 24), ('EX024-B', 'use', TRUE, 24),
('EX025-A', 'use', TRUE, 25), ('EX025-B', 'use', TRUE, 25),
('EX026-A', 'neuf', TRUE, 26), ('EX026-B', 'neuf', TRUE, 26),
('EX027-A', 'bon', TRUE, 27), ('EX027-B', 'bon', TRUE, 27),
('EX028-A', 'use', TRUE, 28), ('EX028-B', 'neuf', TRUE, 28),
('EX029-A', 'neuf', TRUE, 29), ('EX029-B', 'bon', TRUE, 29),
('EX030-A', 'neuf', TRUE, 30), ('EX030-B', 'use', TRUE, 30);


INSERT INTO penaliter (adherant_id, nombre_jour) VALUES
(1, 5),
(2, 10),
(3, 3),
(4, 7); 
