package com.blog.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.blog.models.Categorie;
import com.blog.blog.repositories.CategorieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategorieService {
	
	/* Repository du model Test */
	private final CategorieRepository categorieRepository;
	
	/**
	 * Methode qui retourne tous les categories
	 * 
	 * @return {@link List} {@link Categorie}
	 */
	public List<Categorie> findAll(){
		return this.categorieRepository.findAll();
	}
	
	/**
	 * Methode qui retourne un categorie a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Categorie}
	 */
	public Categorie findById(String id) {
		Optional<Categorie> optional = this.categorieRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	/**
	 * Methode qui sauvegarde un categorie
	 * 
	 * @param categorie {@link Categorie}
	 * 
	 * @return {@link Categorie}
	 */
	public Categorie save(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}
	
	/**
	 * Methode qui supprime un categorie
	 * 
	 * @param categorie {@link Categorie}
	 */
	public void delete(Categorie categorie) {
		this.categorieRepository.delete(categorie);
	}
	
	/**
	 * Methode qui supprime un categorie a partir de son id
	 * 
	 * @param id {@link String}
	 */
	public void deleteById(String id) {
		this.categorieRepository.deleteById(id);
	}
}
