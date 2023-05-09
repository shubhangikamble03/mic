package com.yash.controller;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yash.entity.Contact;
import com.yash.entity.User;
import com.yash.service.UserService;

@RestController
@RequestMapping("/users")
@Produces("application/json")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path="/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@PathVariable Long userId) {
		User user= this.userService.getUser(userId);
		List<Contact> forObject= new ArrayList<>();
	forObject = this.restTemplate.getForObject("http://contact-service/contacts/user/"+userId, forObject.getClass());
		
		user.setContacts(forObject);
		return user;
		
	}
}
