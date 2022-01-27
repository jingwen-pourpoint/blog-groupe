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

import com.blog.blog.models.Article;
import com.blog.blog.models.Test;
import com.blog.blog.services.ArticleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;
    
    /**
     * Methode qui retourne tous les tests
     * 
     * @return {@link List} {@link Test}
     */
    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> findAll(){
    	return this.articleService.findAll();
    }
    
    /**
	 * Methode qui retourne un article a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Article}
	 */
    @GetMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Article findByID(@PathVariable String id) {
		return this.articleService.findById(id);
	}
	
	/**
	 * Methode qui sauvegarde un article
	 * 
	 * @param article {@link Article}
	 * 
	 * @return {@link Article}
	 */
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Article save(@RequestBody Article article) {
		return this.articleService.save(article);
	}
	
	/**
	 * Methode qui supprime un article
	 * 
	 * @param article {@link Article}
	 */
    @DeleteMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Article article) {
		this.articleService.delete(article);
	}
	
	/**
	 * Methode qui supprime un article a partir de son id
	 * 
	 * @param id {@link String}
	 */
    @DeleteMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.articleService.deleteById(id);
	}
}