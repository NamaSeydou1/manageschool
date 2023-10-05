package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "responsableEtudiant")
public class ResponsableEtudiant {
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenoms;
    @Column(nullable = false)
    private Long telephone;
    private String adressemail;

}
