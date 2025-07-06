package com.biblio.model;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "pret")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PretModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "adherant_id")
    private AdherantModel adherant;

    @ManyToOne
    @JoinColumn(name = "exemplaire_id")
    private ExemplaireModel exemplaire;

    @Column(name = "date_pret")
    private LocalDate datePret;

    @Column(name = "date_retour")
    private LocalDate dateRetour;

    @Column(name = "date_effective_retour")
    private LocalDate dateEffectiveRetour;
}
