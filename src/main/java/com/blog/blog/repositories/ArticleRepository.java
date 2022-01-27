package com.blog.blog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Article;

public interface ArticleRepository extends MongoRepository<Article, String> {

}
