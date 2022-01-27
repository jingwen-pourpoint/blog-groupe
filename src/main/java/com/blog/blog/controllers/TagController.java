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

import com.blog.blog.models.Tag;
import com.blog.blog.models.Test;
import com.blog.blog.services.TagService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;
    
    /**
     * Methode qui retourne tous les tests
     * 
     * @return {@link List} {@link Test}
     */
    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tag> findAll(){
    	return this.tagService.findAll();
    }
    
    /**
	 * Methode qui retourne un tag a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Tag}
	 */
    @GetMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tag findByID(@PathVariable String id) {
		return this.tagService.findById(id);
	}
	
	/**
	 * Methode qui sauvegarde un tag
	 * 
	 * @param tag {@link Tag}
	 * 
	 * @return {@link Tag}
	 */
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tag save(@RequestBody Tag tag) {
		return this.tagService.save(tag);
	}
	
	/**
	 * Methode qui supprime un tag
	 * 
	 * @param tag {@link Tag}
	 */
    @DeleteMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Tag tag) {
		this.tagService.delete(tag);
	}
	
	/**
	 * Methode qui supprime un tag a partir de son id
	 * 
	 * @param id {@link String}
	 */
    @DeleteMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.tagService.deleteById(id);
	}
}