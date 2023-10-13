package com.manage.manageschool.domain.base;

import com.manage.manageschool.model.Sexe;
import lombok.Data;

import java.text.DateFormat;

@Data
public class EtudiantRequest {


    private long idEtudiant;
    private String nom;
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
