package com.lucascosmo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucascosmo.workshopmongodomain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
