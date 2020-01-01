package com.manage.manageschool.usecases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.domain.business.usescases.CheckStudentData;
import com.manage.manageschool.domain.business.usescases.EtudiantResponse;
import com.manage.manageschool.model.Etudiant;
import com.manage.manageschool.repository.EtudiantRepository;

public class CheckStudentImpl implements CheckStudentData {

    private final EtudiantRepository etudiantRepository;

    public CheckStudentImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public EtudiantResponse handle(EtudiantRequest input) {
        var exists=this.etudiantRepository.existsById(1L);
        /*
        var idetud=input.getIdEtudiant();
        var adress=input.getAdresse();
        var nom = input.getNom();
        var prenoms=input.getPrenoms();
        var sexe=input.getSexe();
        var adressemail= input.getAdressemail();
        var adresse=input.getAdresse();
        var anneeEntre=input.getAnneeEntre();
        var ecoleanterieure=input.getEcoleanterieure();
        var niveauprecedent=input.getNiveauprecedent();
        var respo=input.getResponsableEtudiant();
        var contactresp=input.getContactResponsable();*/

        if (exists){

            throw new RuntimeException("l'etudiant est deja enregistré");
        }
        else {
            Etudiant etudiant=new Etudiant();
            this.etudiantRepository.save(etudiant);
        }
        return null;
    }
}
