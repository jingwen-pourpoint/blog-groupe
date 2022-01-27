package com.blog.blog.services;

import com.blog.blog.models.Utilisateur;
import com.blog.blog.repositories.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;

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
