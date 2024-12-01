package com.manage.manageschool.domain.business.usescases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;


//@RequestMapping("/etudiant")
public interface CheckStudentData {
    @PostMapping("/nouvel-etudiant")
    Etudiant etud (EtudiantRequest input);

    @GetMapping("/")
    List<Etudiant> etudiantList();
}
