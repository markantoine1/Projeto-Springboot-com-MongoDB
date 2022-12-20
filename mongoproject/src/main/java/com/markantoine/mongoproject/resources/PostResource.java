package com.markantoine.mongoproject.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.markantoine.mongoproject.domain.Post;
import com.markantoine.mongoproject.domain.User;
import com.markantoine.mongoproject.dto.UserDTO;
import com.markantoine.mongoproject.resources.util.URL;
import com.markantoine.mongoproject.services.PostService;
import com.markantoine.mongoproject.services.UserService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

	@Autowired
	private PostService service;
	
	@GetMapping(value = "/{id}")
 	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/titlesearch")
 	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text",defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<Post> foundPosts = service.findByTitle(text);
		return ResponseEntity.ok().body(foundPosts);
	}
	
	}
	
	