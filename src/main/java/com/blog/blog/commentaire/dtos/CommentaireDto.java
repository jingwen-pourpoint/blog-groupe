package com.blog.blog.commentaire.dtos;

import com.blog.blog.utilisateur.dtos.UtilisateurDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentaireDto {
    private String contenu;
    private String utilisateurId;

}
