package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNote;
    private Float valeurNote;
    private Etudiant etudiant;
    private Module module;
    private Semestre semestre;
}
