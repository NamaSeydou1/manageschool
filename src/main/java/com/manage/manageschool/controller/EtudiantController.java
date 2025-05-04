/**
 * @Author:
 * @Date: 2024-11-17 20:32:06
 * @LastEditors: 
 * @LastEditTime: 2025-05-04 13:14:45
 * @FilePath: src/main/java/com/manage/manageschool/controller/EtudiantController.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package com.manage.manageschool.controller;

import com.manage.manageschool.domain.base.EtudiantRequest;
import com.manage.manageschool.domain.business.usescases.CheckStudentData;
import com.manage.manageschool.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    

    @PutMapping("/modifier-etudiant/{id}")
    public Etudiant modifierEtudiant(@PathVariable("id") Long id, @RequestBody EtudiantRequest input) {
        return checkStudentData.modifierEtudiant(id,input);
    }
    

    @GetMapping("/")
    public ResponseEntity<List<Etudiant>> listEtudiant() {
        List<Etudiant> etudiants = checkStudentData.etudiantList();
        return ResponseEntity.ok(etudiants);
    }
}