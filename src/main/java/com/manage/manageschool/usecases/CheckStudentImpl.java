package com.manage.manageschool.usecases;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.domain.business.usescases.CheckStudentData;
import com.manage.manageschool.model.Etudiant;
import com.manage.manageschool.repository.EtudiantRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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
    public Etudiant modifierEtudiant(Long idEtudiant, EtudiantRequest input) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant)
                .orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec l'ID : " + idEtudiant));

        Optional<Etudiant> optionalEtudiant = etudiantRepository.findById(idEtudiant);
        System.out.println("Étudiant trouvé ? " + optionalEtudiant.isPresent());

        if (optionalEtudiant.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Étudiant avec l’ID " + idEtudiant + " non trouvé.");
        }
        // Mise à jour des champs
        etudiant.setAdresse(input.getAdresse());
        etudiant.setDate(input.getDate());
        etudiant.setEcoleanterieure(input.getEcoleanterieure());
        etudiant.setNom(input.getNom());
        etudiant.setPrenoms(input.getPrenoms());
        etudiant.setResponsableEtudiant(input.getResponsableEtudiant());
        etudiant.setNiveauprecedent(input.getNiveauprecedent());
        etudiant.setAnneeEntre(input.getAnneeEntre());
        etudiant.setContactResponsable(input.getContactResponsable());
        etudiant.setSexe(input.getSexe());
        etudiant.setAdressemail(input.getAdressemail());

        return etudiantRepository.save(etudiant);
    }


    @Override
    public void supprimerEtudiant(Long idEtudiant) {
        boolean exists = etudiantRepository.existsById(idEtudiant);
        if (!exists){
            throw new RuntimeException("L'etudiant rattache au matricule"+idEtudiant +" n'existe pas dans la base");
        }
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> etudiantList() {
        return etudiantRepository.findAll();
    }

}
