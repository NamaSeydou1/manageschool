package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "scolarite_etudiant",schema = "public")
public class ScolariteEtudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  //  @ManyToOne(optional = false)
//  @Column(nullable = true)
//    private Etudiant etudiant;
    @Column(nullable = true)
    private Double montantScolarite;
//    @Column(nullable = true)
//    private AnneeScolaire anneeScolaire;

    @Column(nullable = true)
    private Double reduction;
    @Column(nullable = true)
    private Double montantpaye;
    @Column(nullable = true)
    private Double montantrestant;

}
