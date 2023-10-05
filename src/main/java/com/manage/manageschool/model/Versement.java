package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;
import java.text.DateFormat;

@Data
@Entity
@Table(name = "classe")
public class Versement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVersement;
    private Double montant;
    private DateFormat dateVersement;
    @ManyToOne()
    private ScolariteEtudiant scolariteEtudiant;
}
