package com.manage.manageschool.domain.business.usescases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.model.Etudiant;



import java.util.List;



public interface CheckStudentData {

    Etudiant etud (EtudiantRequest input); //creation
    Etudiant modifierEtudiant (Long idEtudiant, EtudiantRequest input); // modification
    void supprimerEtudiant(Long idEtudiant);
    List<Etudiant> etudiantList();
}
