package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "classe")
public class Classe
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClasse;
    private String libelleClasse;
    @ManyToOne()
    private Niveau niveau;
    @OneToMany()
    private Etudiant etudiant;
}
