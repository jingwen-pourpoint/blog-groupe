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
	

	private final TagRepository tagRepository;
	

	public List<Tag> findAll(){

		return this.tagRepository.findAll();
	}
	

	public Tag findById(String id) {
		Optional<Tag> optional = this.tagRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}



	public List<Tag> findById(List<String> tags){
		return (List<Tag>) this.tagRepository.findAllById(tags);
	}


	public Tag save(Tag tag) {
		return this.tagRepository.save(tag);
	}
	

	public void delete(Tag tag) {
		this.tagRepository.delete(tag);
	}
	

	public void deleteById(String id) {
		this.tagRepository.deleteById(id);
	}
}