package com.manage.manageschool.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idModule;
}
