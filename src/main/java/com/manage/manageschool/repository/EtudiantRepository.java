package com.manage.manageschool.repository;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
    //boolean existsById(Long Id);

    Etudiant findByIdEtudiant(Long id);


}
