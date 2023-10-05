package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "scolariteEtudiant")
public class ScolariteEtudiant {
@ManyToOne(optional = false)
    private Etudiant etudiant;
    private Scolarite scolarite;
}
