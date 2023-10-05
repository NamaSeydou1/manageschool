package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "niveau")
public class Niveau {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNiveau;
    private String libelleNiveau;

    @ManyToMany()
    private Filiere filiere;
}
