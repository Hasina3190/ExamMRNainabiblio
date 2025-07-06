package com.biblio.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "penaliter")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PenaliterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "adherant_id")
    private AdherantModel adherant;

    @Column(name = "nombre_jour")
    private int nombreJour;
}
