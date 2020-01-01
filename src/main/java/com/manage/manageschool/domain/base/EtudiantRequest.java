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
    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getAdressemail() {
        return adressemail;
    }

    public void setAdressemail(String adressemail) {
        this.adressemail = adressemail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getEcoleanterieure() {
        return ecoleanterieure;
    }

    public void setEcoleanterieure(String ecoleanterieure) {
        this.ecoleanterieure = ecoleanterieure;
    }

    public String getNiveauprecedent() {
        return niveauprecedent;
    }

    public void setNiveauprecedent(String niveauprecedent) {
        this.niveauprecedent = niveauprecedent;
    }

    public String getAnneeEntre() {
        return anneeEntre;
    }

    public void setAnneeEntre(String anneeEntre) {
        this.anneeEntre = anneeEntre;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public String getResponsableEtudiant() {
        return responsableEtudiant;
    }

    public void setResponsableEtudiant(String responsableEtudiant) {
        this.responsableEtudiant = responsableEtudiant;
    }

    public String getContactResponsable() {
        return contactResponsable;
    }

    public void setContactResponsable(String contactResponsable) {
        this.contactResponsable = contactResponsable;
    }


}
