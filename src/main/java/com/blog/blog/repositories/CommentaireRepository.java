package com.blog.blog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Commentaire;

public interface CommentaireRepository extends MongoRepository<Commentaire, String>{

}
