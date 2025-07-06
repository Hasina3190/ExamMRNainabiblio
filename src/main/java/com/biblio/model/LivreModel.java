package com.biblio.model;

import javax.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "livre")
public class LivreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String auteur;
    private String langue;
    private Integer accessibilite;
    private Integer annee_publication;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreModel genre;

    @OneToMany(mappedBy = "livre", cascade = CascadeType.ALL)
    private List<ExemplaireModel> exemplaires;
}
