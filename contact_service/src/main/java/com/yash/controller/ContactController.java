package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Contact;
import com.yash.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(path="/user/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getContact(@PathVariable("userId") Long userId){
		
		return this.contactService.getContactsOfUser(userId);
	}

}
