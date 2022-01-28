package com.blog.blog.article.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.blog.blog.categorie.dtos.CategorieDto;
import com.blog.blog.tag.dtos.TagDto;
import com.blog.blog.utilisateur.dtos.UtilisateurDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ArticleDto {
    private String titre;
    private String slug;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") private LocalDateTime dateCreation;
    private String contenu;
    private String utilisateurId;
    private String image;
    private String categoryId;
    private List<String> tagIds;

}
