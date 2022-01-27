package com.blog.blog.categorie.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {

}
