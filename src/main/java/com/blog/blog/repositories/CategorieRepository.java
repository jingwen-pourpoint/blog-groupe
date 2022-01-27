package com.blog.blog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {

}
