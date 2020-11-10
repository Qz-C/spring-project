package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value="/users") 
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(23L, "Thayná", "thaynamuller88@gmail.com","8888-8888", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
