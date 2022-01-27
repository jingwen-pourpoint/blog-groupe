package com.blog.blog.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	
	@Id
	private String id;
	
	private String titre;
	
	private String slug;
	
	private String description;
	
	private LocalDateTime dateDeCreation;
	
	private String contenu;
	
	private Utilisateur auteur;
	
	private String imageDePresentation;
	
	private Categorie categorie;
	
	private List<Tag> tags;
}
