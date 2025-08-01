package com.lucascosmo.workshopmongo.service;

import org.springframework.stereotype.Service;

import com.lucascosmo.workshopmongo.repository.PostRepository;
import com.lucascosmo.workshopmongo.service.exception.ObjectNotFoundException;
import com.lucascosmo.workshopmongodomain.Post;

@Service
public class PostService {
    private final PostRepository repo;
    public PostService(PostRepository repo) { this.repo = repo; }
    public Post findById(String id) {
        return repo.findById(id)
                   .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}


