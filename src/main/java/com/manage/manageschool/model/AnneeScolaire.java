package com.manage.manageschool.model;

import lombok.Data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Data
@Table(name = "annee_scolaire", schema = "public")
public class AnneeScolaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idannee;
    @Column(nullable = true)
    private String annee;
    @OneToMany
    @Column(nullable = true)
    private List<Semestre> semestreList;

}
