package com.manage.manageschool.domain.business.usescases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import org.springframework.web.bind.annotation.PostMapping;

public interface CheckStudentData {
    @PostMapping("/nouvel-etudiant")
    EtudiantResponse handle(EtudiantRequest input);
}
