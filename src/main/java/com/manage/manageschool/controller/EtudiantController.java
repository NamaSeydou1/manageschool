/**
 * @Author:
 * @Date: 2024-11-17 20:32:06
 * @LastEditors: 
 * @LastEditTime: 2025-05-04 14:03:32
 * @FilePath: src/main/java/com/manage/manageschool/controller/EtudiantController.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package com.manage.manageschool.controller;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.domain.business.usescases.CheckStudentData;
import com.manage.manageschool.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {

    private final CheckStudentData checkStudentData;

    @Autowired
    public EtudiantController(CheckStudentData checkStudentData) {
        
        this.checkStudentData = checkStudentData;
    }

    @PostMapping("/nouvel-etudiant")
    /*@CrossOrigin(origins = "*") */
    public Etudiant etud (@RequestBody EtudiantRequest input) {
        
        return checkStudentData.etud(input);
    }
    
/*
    @PutMapping("/modifier-etudiant/{id}")
    public Etudiant modifierEtudiant(@PathVariable("id") Long id, @RequestBody EtudiantRequest input) {
        return checkStudentData.modifierEtudiant(id,input);
    }
*/

    @PutMapping("/modifier-etudiant/{id}")
    public ResponseEntity<?> modifierEtudiant(@PathVariable("id") Long id, @RequestBody EtudiantRequest input) {
        Etudiant etudiantModifie = checkStudentData.modifierEtudiant(id, input);
        return ResponseEntity.ok().body(Map.of(
                "message", "La modification a été effectuée avec succès.",
                "etudiant", etudiantModifie
        ));
    }
    
    
    
    @DeleteMapping("/supprimer-etudiant/{id}")
    public ResponseEntity<String> supprimerEtudiant(@PathVariable("id") Long id) {
        try {
            checkStudentData.supprimerEtudiant(id);
            return ResponseEntity.ok("Étudiant(e) supprimé(e) avec succès.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/")
    public ResponseEntity<List<Etudiant>> listEtudiant() {
        List<Etudiant> etudiants = checkStudentData.etudiantList();
        return ResponseEntity.ok(etudiants);
    }
    
    
    
}