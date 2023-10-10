package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "classe",schema = "public")
public class Classe
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long idClasse;
    private String libelleClasse;
    @ManyToOne()
    private Niveau niveau;
    @OneToMany()
    private Etudiant etudiant;
}
