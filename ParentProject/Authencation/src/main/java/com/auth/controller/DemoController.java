package com.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.User;

@RestController
@RequestMapping("/test")
public class DemoController {

	@Autowired
	private UserRepo repo;
	
	@GetMapping
	public String test() {
		User save = repo.save(new User("RAHUL HENCHA"));
		return "SUCCESS :: "+save.getId();
	}
}
