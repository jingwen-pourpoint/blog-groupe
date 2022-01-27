package com.blog.blog.utilisateur.controllers;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.models.Utilisateur;
import com.blog.blog.utilisateur.services.UtilisateurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/utilisateurs")


public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @PostMapping(value = "")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur body) {
        return utilisateurService.addUtilisateur(body);
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurService.getUtilisateurs();
    }

    @GetMapping(value = "/{utilisateurId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur getUtilisateur(@PathVariable("utilisateurId") String utilisateurId) {
        return utilisateurService.getUtilisateur(utilisateurId);
    }

    @DeleteMapping(value = "/{utilisateurId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUtilisateur(@PathVariable("utilisateurId") String utilisateurId) {
        utilisateurService.deleteUtilisateur(utilisateurId);
    }

    @PutMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurService.updateUtilisateur(utilisateur);
    }


}
