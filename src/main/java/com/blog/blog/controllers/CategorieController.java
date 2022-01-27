package com.blog.blog.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.models.Categorie;
import com.blog.blog.models.Test;
import com.blog.blog.services.CategorieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;
    
    /**
     * Methode qui retourne tous les tests
     * 
     * @return {@link List} {@link Test}
     */
    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categorie> findAll(){
    	return this.categorieService.findAll();
    }
    
    /**
	 * Methode qui retourne un categorie a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Categorie}
	 */
    @GetMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie findByID(@PathVariable String id) {
		return this.categorieService.findById(id);
	}
	
	/**
	 * Methode qui sauvegarde un categorie
	 * 
	 * @param categorie {@link Categorie}
	 * 
	 * @return {@link Categorie}
	 */
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie save(@RequestBody Categorie categorie) {
		return this.categorieService.save(categorie);
	}
	
	/**
	 * Methode qui supprime un categorie
	 * 
	 * @param categorie {@link Categorie}
	 */
    @DeleteMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Categorie categorie) {
		this.categorieService.delete(categorie);
	}
	
	/**
	 * Methode qui supprime un categorie a partir de son id
	 * 
	 * @param id {@link String}
	 */
    @DeleteMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.categorieService.deleteById(id);
	}
}
