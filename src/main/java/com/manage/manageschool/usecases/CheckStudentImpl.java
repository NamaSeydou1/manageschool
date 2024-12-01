package com.manage.manageschool.usecases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.domain.business.usescases.CheckStudentData;
import com.manage.manageschool.model.Etudiant;
import com.manage.manageschool.repository.EtudiantRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CheckStudentImpl implements CheckStudentData {

    private final EtudiantRepository etudiantRepository;

    public CheckStudentImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant etud (EtudiantRequest input) {
        var idEtudiant=input.getIdEtudiant();
        var exists=this.etudiantRepository.existsById(idEtudiant);

        if (exists){

            throw new RuntimeException("l'etudiant est deja enregistré");
        }
        else {
            Etudiant etudiant=new Etudiant();
            etudiant.setAdresse(input.getAdresse());
            etudiant.setDate(input.getDate());
            etudiant.setIdEtudiant(input.getIdEtudiant());
            etudiant.setEcoleanterieure(input.getEcoleanterieure());
            etudiant.setNom(input.getNom());
            etudiant.setPrenoms(input.getPrenoms());
            etudiant.setResponsableEtudiant(input.getResponsableEtudiant());
            etudiant.setNiveauprecedent(input.getNiveauprecedent());
            etudiant.setAnneeEntre(input.getAnneeEntre());
            etudiant.setContactResponsable(input.getContactResponsable());
            etudiant.setSexe(input.getSexe());
            etudiant.setAdressemail(input.getAdressemail());

            //this.etudiantRepository.save(etudiant);
            return etudiantRepository.save(etudiant);
        }

    }

    @Override
    public List<Etudiant> etudiantList() {
        return etudiantRepository.findAll();
    }

}
