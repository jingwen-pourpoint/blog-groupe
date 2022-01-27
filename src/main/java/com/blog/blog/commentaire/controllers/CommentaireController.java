package com.blog.blog.commentaire.controllers;

import java.util.List;

import com.blog.blog.commentaire.dtos.CommentaireDto;
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
    

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Commentaire> findAll(){
    	return this.commentaireService.findAll();
    }
    

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Commentaire findByID(@PathVariable String id) {
		return this.commentaireService.findById(id);
	}
	

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Commentaire save(@RequestBody CommentaireDto commentaire) {
		return this.commentaireService.save(commentaire);
	}
	

    @DeleteMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Commentaire commentaire) {
		this.commentaireService.delete(commentaire);
	}
	

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.commentaireService.deleteById(id);
	}
}