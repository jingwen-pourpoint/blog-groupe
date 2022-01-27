package com.blog.blog.commentaire.services;

import java.util.List;
import java.util.Optional;

import com.blog.blog.commentaire.dtos.CommentaireDto;
import com.blog.blog.models.Utilisateur;
import com.blog.blog.utilisateur.repositories.UtilisateurRepository;
import com.blog.blog.utilisateur.services.UtilisateurService;
import org.springframework.stereotype.Service;

import com.blog.blog.commentaire.repositories.CommentaireRepository;
import com.blog.blog.models.Commentaire;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentaireService {


	
	/* Repository du model Test */
	private final CommentaireRepository commentaireRepository;
	private final UtilisateurService utilisateurService;
	
	/**
	 * Methode qui retourne tous les commentaires
	 * 
	 * @return {@link List} {@link Commentaire}
	 */
	public List<Commentaire> findAll(){
		return this.commentaireRepository.findAll();
	}
	
	/**
	 * Methode qui retourne un commentaire a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Commentaire}
	 */
	public Commentaire findById(String id) {
		Optional<Commentaire> optional = this.commentaireRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	/**
	 * Methode qui sauvegarde un commentaire
	 * 
	 * @param commentaire {@link Commentaire}
	 * 
	 * @return {@link Commentaire}
	 */
	public Commentaire save(CommentaireDto commentaireDto) {
		Utilisateur utilisateur = utilisateurService.getUtilisateur(commentaireDto.getUtilisateurId());
		Commentaire commentaire = new Commentaire();
		commentaire.setContenu(commentaireDto.getContenu());
		commentaire.setUtilisateur(utilisateur);
		return this.commentaireRepository.save(commentaire);
	}
	
	/**
	 * Methode qui supprime un commentaire
	 * 
	 * @param commentaire {@link Commentaire}
	 */
	public void delete(Commentaire commentaire) {
		this.commentaireRepository.delete(commentaire);
	}
	
	/**
	 * Methode qui supprime un commentaire a partir de son id
	 * 
	 * @param id {@link String}
	 */
	public void deleteById(String id) {
		this.commentaireRepository.deleteById(id);
	}
}
