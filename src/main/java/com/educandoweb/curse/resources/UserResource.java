package com.educandoweb.curse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Maria Clara Carvalho",
				"maria@gmail.com", "40028922", "lovematheus");
		return ResponseEntity.ok().body(u);
	}
	
}
