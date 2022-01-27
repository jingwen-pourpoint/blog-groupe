package com.blog.blog.article.controllers;

import java.util.List;

import com.blog.blog.article.dtos.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.article.services.ArticleService;
import com.blog.blog.models.Article;
import com.blog.blog.models.Test;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;
    

    @GetMapping(value = "",  produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> findAll(){
    	return this.articleService.findAll();
    }
    

    @GetMapping(value = "{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Article findByID(@PathVariable String id) {
		return this.articleService.findById(id);
	}
	

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Article save(@RequestBody ArticleDto articleDto) {
		return this.articleService.save(articleDto);
	}
	

    @DeleteMapping(value = "",  produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Article article) {
		this.articleService.delete(article);
	}
	

    @DeleteMapping(value = "{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.articleService.deleteById(id);
	}
}