package com.blog.blog.tag.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.blog.models.Tag;

public interface TagRepository extends MongoRepository<Tag, String> {

}
