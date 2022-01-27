package com.blog.blog.article.services;

import java.util.List;
import java.util.Optional;

import com.blog.blog.article.dtos.ArticleDto;
import com.blog.blog.categorie.services.CategorieService;
import com.blog.blog.models.Categorie;
import com.blog.blog.models.Tag;
import com.blog.blog.models.Utilisateur;
import com.blog.blog.tag.services.TagService;
import com.blog.blog.utilisateur.services.UtilisateurService;
import org.springframework.stereotype.Service;

import com.blog.blog.article.repositories.ArticleRepository;
import com.blog.blog.models.Article;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {
	
	/* Repository du model Test */
	private final ArticleRepository articleRepository;
	private final UtilisateurService utilisateurService;
	private final CategorieService categorieService;
	private final TagService tagService;
	

	public List<Article> findAll(){
		return this.articleRepository.findAll();
	}
	

	public Article findById(String id) {
		Optional<Article> optional = this.articleRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	

	public Article save(ArticleDto articleDto) {
		Utilisateur utilisateur = utilisateurService.getUtilisateur(articleDto.getUtilisateurId());
		Categorie category = categorieService.findById(articleDto.getCategoryId());
		List<Tag> tags = tagService.findById(articleDto.getTagIds());

		Article article = new Article();
		article.setTitre(articleDto.getTitre());
		article.setSlug(articleDto.getSlug());
		article.setDescription(articleDto.getDescription());
		article.setDateDeCreation(articleDto.getDateCreation());
		article.setContenu(articleDto.getContenu());
		article.setAuteur(utilisateur);
		article.setImageDePresentation(articleDto.getImage());
		article.setCategorie(category);
		article.setTags(tags);

		return this.articleRepository.save(article);
	}
	

	public void delete(Article article) {
		this.articleRepository.delete(article);
	}
	

	public void deleteById(String id) {
		this.articleRepository.deleteById(id);
	}
}
