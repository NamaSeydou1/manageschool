package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "filiere")
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFiliere;
    private String nomFilere;
    @ManyToOne()
    private Branche branche;
}
