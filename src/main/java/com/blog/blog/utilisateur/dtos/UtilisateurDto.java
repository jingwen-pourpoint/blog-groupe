package com.blog.blog.utilisateur.dtos;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UtilisateurDto {
    private String username;
    private String password;
    private String email;


}
