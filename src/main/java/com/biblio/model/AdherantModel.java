package com.biblio.model;

import javax.persistence.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adherant")
public class AdherantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;

    @Column(name = "mot_de_passe")
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeAdherantModel type;

}

