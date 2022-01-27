package com.blog.blog.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentaireDto {
    private String contenu;
    private UtilisateurDto utilisateur;

}
