package com.julianna.serverd.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultings")
public class ServerDResource {
	
	@PostMapping
	public ResponseEntity<String> getConnectionOk(){
		System.out.println("Passei por aqui");
		return ResponseEntity.ok().body("Very Fine!");
	}

}
