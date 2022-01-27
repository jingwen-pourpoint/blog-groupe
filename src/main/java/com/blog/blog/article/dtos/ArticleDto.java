package com.blog.blog.article.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.blog.blog.categorie.dtos.CategorieDto;
import com.blog.blog.tag.dtos.TagDto;
import com.blog.blog.utilisateur.dtos.UtilisateurDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


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
