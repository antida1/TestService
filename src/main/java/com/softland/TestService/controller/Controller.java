package com.softland.TestService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softland.TestService.model.dto.UserDto;

@RestController
public class Controller {
	
	@GetMapping("/{path}")
	public ResponseEntity<String> getWithParams(
			@PathVariable String path,
			@RequestParam String request) {
		return ResponseEntity.ok(path.concat(" ").concat(request));
	}
	
	@GetMapping
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("It's works");
	}
	
	@PostMapping
	public String create(UserDto user) {
		return "Post working";
	}
	
	@PutMapping
	@ResponseBody
	public UserDto update() {
		return new UserDto("Lina", "David");
	}

}
