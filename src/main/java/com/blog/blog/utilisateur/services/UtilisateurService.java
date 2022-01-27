package com.blog.blog.utilisateur.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.blog.models.Utilisateur;
import com.blog.blog.utilisateur.repositories.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.insert(utilisateur);
    }

    public List<Utilisateur> getUtilisateurs(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateur(String utilisateurId){
        return utilisateurRepository.findById(utilisateurId).orElse(null);
    }

    public void deleteUtilisateur(String utilisateurId){
         utilisateurRepository.deleteById(utilisateurId);
    }


}
