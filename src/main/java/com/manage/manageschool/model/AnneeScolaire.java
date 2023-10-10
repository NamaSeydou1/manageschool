package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "annee_scolaire", schema = "public")
public class AnneeScolaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String annee;
    @OneToMany()
    private Semestre semestres;

}
