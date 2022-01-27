package com.blog.blog.tag.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.blog.models.Tag;
import com.blog.blog.tag.repositories.TagRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TagService {
	
	/* Repository du model Test */
	private final TagRepository tagRepository;
	
	/**
	 * Methode qui retourne tous les tags
	 * 
	 * @return {@link List} {@link Tag}
	 */
	public List<Tag> findAll(){
		return this.tagRepository.findAll();
	}
	
	/**
	 * Methode qui retourne un tag a partir de son id
	 * 
	 * @param id {@link String}
	 * 
	 * @return {@link Tag}
	 */
	public Tag findById(String id) {
		Optional<Tag> optional = this.tagRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	/**
	 * Methode qui sauvegarde un tag
	 * 
	 * @param tag {@link Tag}
	 * 
	 * @return {@link Tag}
	 */
	public Tag save(Tag tag) {
		return this.tagRepository.save(tag);
	}
	
	/**
	 * Methode qui supprime un tag
	 * 
	 * @param tag {@link Tag}
	 */
	public void delete(Tag tag) {
		this.tagRepository.delete(tag);
	}
	
	/**
	 * Methode qui supprime un tag a partir de son id
	 * 
	 * @param id {@link String}
	 */
	public void deleteById(String id) {
		this.tagRepository.deleteById(id);
	}
}