package com.blog.blog.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire {
	
	@Id
	private String id;
	
	private String contenu;
	
	private Utilisateur utilisateur;
}
