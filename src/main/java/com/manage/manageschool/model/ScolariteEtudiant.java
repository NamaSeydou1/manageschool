package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "scolarite_etudiant",schema = "public")
public class ScolariteEtudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(optional = false)
    private Etudiant etudiant;
    private Double montantScolarite;
    private AnneeScolaire anneeScolaire;
    @Column(nullable = true)
    private Double reduction;
    private Double montantpaye;
    private Double montantrestant;

}
