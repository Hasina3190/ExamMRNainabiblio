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
    @JoinColumn(name = "adherant_id", nullable = false)
    private AdherantModel adherant;

    @ManyToOne
    @JoinColumn(name = "exemplaire_id", nullable = false)
    private ExemplaireModel exemplaire;

    @Column(name = "date_pret", nullable = false)
    private LocalDate datePret;

    @Column(name = "date_retour", nullable = false)
    private LocalDate dateRetour;

    @Column(name = "date_effective_retour")
    private LocalDate dateEffectiveRetour;

    @ManyToOne
    @JoinColumn(name = "type_pret_id", nullable = false)
    private TypePretModel typePret;

}
