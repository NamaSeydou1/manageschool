package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "anneescolaire")
public class AnneeScolaire {
    private String annee;

    @ManyToMany()
    private Semestre semestre;
}
