package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import java.text.DateFormat;

@Data
@Entity
@Table(name = "versement", schema = "public")
public class Versement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVersement;
    private Double montant;
    private DateFormat dateVersement;
    //@ManyToOne()
   // private ScolariteEtudiant scolariteEtudiant;
}
