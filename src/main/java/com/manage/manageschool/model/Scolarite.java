package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "scolarite", schema = "public")
public class Scolarite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
