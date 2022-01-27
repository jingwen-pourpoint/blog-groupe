package com.blog.blog.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@ToString
public class ArticleDto {
    private String titre;
    private String slug;
    private String Description;
    private LocalDateTime dateCreation;
    private String contenu;
    private UtilisateurDto auteur;
    private String image;
    private CategorieDto categorie;
    private List<TagDto> tags;

}
