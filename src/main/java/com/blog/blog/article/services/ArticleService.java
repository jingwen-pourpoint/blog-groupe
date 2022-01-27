package com.blog.blog.article.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.blog.article.repositories.ArticleRepository;
import com.blog.blog.models.Article;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {
	
	/* Repository du model Test */
	private final ArticleRepository articleRepository;
	
	/**
	 * Methode qui retourne tous les articles
	 * 
	 * @return {@link List} {@link Article}
	 */
	public List<Article> findAll(){
		return this.articleRepository.findAll();
	}
	
	/**
	 * Methode qui retourne un article a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Article}
	 */
	public Article findById(String id) {
		Optional<Article> optional = this.articleRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	/**
	 * Methode qui sauvegarde un article
	 * 
	 * @param article {@link Article}
	 * 
	 * @return {@link Article}
	 */
	public Article save(Article article) {
		return this.articleRepository.save(article);
	}
	
	/**
	 * Methode qui supprime un article
	 * 
	 * @param article {@link Article}
	 */
	public void delete(Article article) {
		this.articleRepository.delete(article);
	}
	
	/**
	 * Methode qui supprime un article a partir de son id
	 * 
	 * @param id {@link String}
	 */
	public void deleteById(String id) {
		this.articleRepository.deleteById(id);
	}
}
