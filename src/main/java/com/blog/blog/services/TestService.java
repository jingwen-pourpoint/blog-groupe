package com.blog.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.blog.models.Test;
import com.blog.blog.repositories.TestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
	
	/* Repository du model Test */
	private final TestRepository testRepository;
	
	/**
	 * Methode qui retourne tous les tests
	 * 
	 * @return {@link List} {@link Test}
	 */
	public List<Test> findAll(){
		return this.testRepository.findAll();
	}
}
