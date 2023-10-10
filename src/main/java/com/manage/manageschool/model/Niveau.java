package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "niveau",schema = "public")
public class Niveau {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long idNiveau;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNiveau;
    private String libelleNiveau;

    @ManyToMany
    @JoinTable(
            name = "niveau_filiere",
            joinColumns = @JoinColumn(name = "niveau_id"),
            inverseJoinColumns = @JoinColumn(name = "filiere_id")
    )
    //private Set<Filiere> filieres = new HashSet<>();
    private Filiere filieres ;
}
