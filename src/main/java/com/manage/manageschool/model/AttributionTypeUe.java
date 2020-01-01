package com.manage.manageschool.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "module")
public class AttributionTypeUe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAttribUe;
    @Column(nullable = true)
    private Status status;
    @Column(nullable = true)
    private Integer coef;

   // @ManyToOne()
//   @Column(nullable = true)
//    private Module module;
   // @ManyToOne()
//   @Column(nullable = true)
//    private Niveau niveau;

}
