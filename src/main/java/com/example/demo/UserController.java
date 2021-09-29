package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("/")
	void getUsers() {
		System.out.println("called");
	}
	
	@GetMapping("/{id}")
	void getUser(@PathVariable("id") int id) {
		System.out.println("called "+id);
	}
	@PostMapping
	String postCall(@RequestBody User user) {
		System.out.println("post called by "+user.getName());
		return "Post Called by "+ user.getName();
	}
	@PutMapping
	String putCall() {
		System.out.println("put call");
		return "Put Called...";
	}
	
}
