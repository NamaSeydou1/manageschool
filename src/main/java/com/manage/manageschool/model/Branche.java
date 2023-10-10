package com.manage.manageschool.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//@Data
@Entity
@Table(name = "branche",schema = "public")
public class Branche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idbranch;

    public Long getIdbranch() {
        return idbranch;
    }

    public void setIdbranch(Long idbranch) {
        this.idbranch = idbranch;
    }
}
