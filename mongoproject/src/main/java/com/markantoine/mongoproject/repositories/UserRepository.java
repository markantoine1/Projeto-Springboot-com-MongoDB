package com.markantoine.mongoproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.markantoine.mongoproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}