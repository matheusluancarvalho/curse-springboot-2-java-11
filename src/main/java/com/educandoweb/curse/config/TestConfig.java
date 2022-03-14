package com.educandoweb.curse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curse.entities.User;
import com.educandoweb.curse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Clara Carvalho", "maria@gmail.com", "988888888", "loveMatheus");
		User u2 = new User(null, "Matheus Carvalho", "matheus@gmail.com", "977777777", "loveMariaClara");
		
		userRepository.saveAll(Arrays.asList(u1, u2));	
		
	}
	
	
	

}
