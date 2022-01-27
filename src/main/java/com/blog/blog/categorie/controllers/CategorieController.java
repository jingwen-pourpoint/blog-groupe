package com.blog.blog.categorie.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.categorie.services.CategorieService;
import com.blog.blog.models.Categorie;
import com.blog.blog.models.Test;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;
    

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categorie> findAll(){
    	return this.categorieService.findAll();
    }
    

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie findByID(@PathVariable String id) {
		return this.categorieService.findById(id);
	}
	

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie save(@RequestBody Categorie categorie) {
		return this.categorieService.save(categorie);
	}


    @DeleteMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Categorie categorie) {
		this.categorieService.delete(categorie);
	}
	

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.categorieService.deleteById(id);
	}
}
