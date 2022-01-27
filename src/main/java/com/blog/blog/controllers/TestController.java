package com.blog.blog.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.models.Test;
import com.blog.blog.services.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;
    
    /**
     * Methode qui retourne tous les tests
     * 
     * @return {@link List} {@link Test}
     */
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Test> findAll(){
    	return this.testService.findAll();
    }
}