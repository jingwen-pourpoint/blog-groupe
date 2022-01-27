package com.blog.blog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blog.blog.models.Test;

@Repository
public interface TestRepository extends MongoRepository<Test, String>{

}
