package com.manage.manageschool.model;
import jakarta.persistence.*;
import lombok.Data;

import java.text.DateFormat;

@Table(name = "etudiant",schema = "public")
@Entity
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEtudiant;

    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenoms;
    private String adressemail;
    private String adresse;
    private Sexe sexe;
    private String ecoleanterieure;
    private String niveauprecedent;
    private String anneeEntre;
    private DateFormat date;
    private String responsableEtudiant;
    private String contactResponsable;





}
