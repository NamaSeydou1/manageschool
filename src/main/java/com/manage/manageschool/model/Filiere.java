package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

//@Data
@Entity
@Table(name = "filiere",schema = "public")
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFiliere;
    private String nomFilere;
    @ManyToOne()
    private Branche branche;
}
