package com.blog.blog.connexion.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.blog.models.Utilisateur;
import com.blog.blog.utilisateur.repositories.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConnexionService {
	
	private final UtilisateurRepository utilisateurRepository;
	
	/**
	 * Methode qui permet la connexion d un utilisateur
	 * 
	 * @param utilisateur {@link Utilisateur}
	 * 
	 * @return {@link boolean}
	 */
	public Utilisateur connect(Utilisateur utilisateur) {
		
		/* Recuperation de l utilisateur sous forme d optional */
		Optional<Utilisateur> optional = this.utilisateurRepository.findByEmail(utilisateur.getEmail());
		
		/* Verifie si la connexion est possible et renvoi le resultat */
		if(optional.isPresent() && optional.get().getPassword().equals(utilisateur.getPassword())) {
			return optional.get();
		}
		else {
			return null;
		}
	}
}
