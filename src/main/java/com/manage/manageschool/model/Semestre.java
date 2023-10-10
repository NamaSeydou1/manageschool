package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "semestre", schema = "public")
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libSemestre;
}
