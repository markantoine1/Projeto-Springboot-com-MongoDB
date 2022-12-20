package com.markantoine.mongoproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.markantoine.mongoproject.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}