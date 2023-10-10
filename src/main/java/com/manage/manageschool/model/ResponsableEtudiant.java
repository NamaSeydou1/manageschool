package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "responsable_etudiant",schema = "public")
public class ResponsableEtudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenoms;
    @Column(nullable = false)
    private Long telephone;
    private String adressemail;

}
