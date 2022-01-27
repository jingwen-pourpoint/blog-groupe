package com.blog.blog.tag.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.models.Tag;
import com.blog.blog.models.Test;
import com.blog.blog.tag.services.TagService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;
    

    @GetMapping(value = "",  produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tag> findAll(){
    	return this.tagService.findAll();
    }
    

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tag findByID(@PathVariable String id) {
		return this.tagService.findById(id);
	}
	

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tag save(@RequestBody Tag tag) {
		return this.tagService.save(tag);
	}
	

    @DeleteMapping(value = "",  produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Tag tag) {
		this.tagService.delete(tag);
	}
	

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable String id) {
		this.tagService.deleteById(id);
	}
}