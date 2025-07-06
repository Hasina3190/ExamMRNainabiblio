package com.biblio.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "gestion_pret")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GestionPretModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "adherant_id", nullable = false, unique = true)
    private AdherantModel adherant;

    @Column(name = "nombre_max", nullable = false)
    private int nombreMax;
}

