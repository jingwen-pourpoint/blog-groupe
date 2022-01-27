package com.blog.blog.article.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

}
