package com.markantoine.mongoproject.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markantoine.mongoproject.domain.Post;
import com.markantoine.mongoproject.domain.User;
import com.markantoine.mongoproject.dto.UserDTO;
import com.markantoine.mongoproject.repositories.PostRepository;
import com.markantoine.mongoproject.repositories.UserRepository;
import com.markantoine.mongoproject.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id){
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}