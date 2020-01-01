package com.manage.manageschool.model;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
@Table(name = "semestre", schema = "public")
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idsemestre;
    @Column(nullable = true)
    private String libSemestre;
    @ManyToOne
    @JoinColumn(name="idannee")
    private AnneeScolaire anneeScolaire;
}
