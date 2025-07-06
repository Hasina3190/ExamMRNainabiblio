package com.biblio.model;

import javax.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exemplaire")
public class ExemplaireModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_exemplaire", unique = true, nullable = false)
    private String numeroExemplaire;

    private String etat;
    private Boolean disponible;

    @ManyToOne
    @JoinColumn(name = "livre_id", nullable = false)
    private LivreModel livre;
}
