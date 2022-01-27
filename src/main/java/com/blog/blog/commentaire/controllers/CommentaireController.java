package com.blog.blog.commentaire.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.commentaire.services.CommentaireService;
import com.blog.blog.models.Commentaire;
import com.blog.blog.models.Test;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/commentaires")
@RequiredArgsConstructor
public class CommentaireController {

    private final CommentaireService commentaireService;
    
    /**
     * Methode qui retourne tous les commentaires
     * 
     * @return {@link List} {@link Test}
     */
    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Commentaire> findAll(){
    	return this.commentaireService.findAll();
    }
    
    /**
	 * Methode qui retourne un commentaire a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Commentaire}
	 */
    @GetMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Commentaire findByID(@PathVariable String id) {
		return this.commentaireService.findById(id);
	}
	
	/**
	 * Methode qui sauvegarde un commentaire
	 * 
	 * @param commentaire {@link Commentaire}
	 * 
	 * @return {@link Commentaire}
	 */
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Commentaire save(@RequestBody Commentaire commentaire) {
		return this.commentaireService.save(commentaire);
	}
	
	/**
	 * Methode qui supprime un commentaire
	 * 
	 * @param commentaire {@link Commentaire}
	 */
    @DeleteMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Commentaire commentaire) {
		this.commentaireService.delete(commentaire);
	}
	
	/**
	 * Methode qui supprime un commentaire a partir de son id
	 * 
	 * @param id {@link String}
	 */
    @DeleteMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.commentaireService.deleteById(id);
	}
}