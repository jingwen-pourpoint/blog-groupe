package com.blog.blog.commentaire.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.blog.commentaire.repositories.CommentaireRepository;
import com.blog.blog.models.Commentaire;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentaireService {
	
	/* Repository du model Test */
	private final CommentaireRepository commentaireRepository;
	
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
	public Commentaire save(Commentaire commentaire) {
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
