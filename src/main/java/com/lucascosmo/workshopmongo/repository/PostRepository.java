package com.lucascosmo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucascosmo.workshopmongodomain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
