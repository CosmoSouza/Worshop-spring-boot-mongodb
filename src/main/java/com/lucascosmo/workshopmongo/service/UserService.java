package com.lucascosmo.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascosmo.workshopmongo.dto.UserDTO;
import com.lucascosmo.workshopmongo.repository.UserRepository;
import com.lucascosmo.workshopmongo.service.exception.ObjectNotFoundException;
import com.lucascosmo.workshopmongodomain.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
		
	}
	
	public User findById(String id) {
	    return repo.findById(id)
	               .orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	}

  public User insert(User obj) {
	  return repo.insert(obj);
  }
  
  public User fromDTO(UserDTO objDto) {
	  return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }  
}
  

