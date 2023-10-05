package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "branche")
public class Branche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idbranch;
    private String branche;
}
