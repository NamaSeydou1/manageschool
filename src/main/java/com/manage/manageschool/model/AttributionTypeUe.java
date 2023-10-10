package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "module")
public class AttributionTypeUe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAttribUe;
    private Status status;
    private Integer coef;

    @ManyToOne()
    private Module module;
    @ManyToOne()
    private Niveau niveau;

}
