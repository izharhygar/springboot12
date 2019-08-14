package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private userService service;

	
	@GetMapping
	public User[] getuser()
	{   
		return this.service.getUsers();
	}
	@GetMapping("/{id}")
	public User getoneuser(@PathVariable("id") String Id)
	{
		return this.service.getOneUser(Id);
	}
//	@PutMapping
//	public User putoneuser(@RequestBody User user)
//	{
//		this.service.addUser(user);
//		return user;
//	}
//	
}
