package com.blog.blog.connexion.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.connexion.services.ConnexionService;
import com.blog.blog.models.Utilisateur;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/connexion")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ConnexionController {
	
	private final ConnexionService connexionService;

	/**
	 * Methode qui permet la connexion d un utilisateur
	 * 
	 * @param utilisateur {@link Utilisateur}
	 */
	@PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur connect(@RequestBody Utilisateur utilisateur) {
    	return this.connexionService.connect(utilisateur);
    }
}