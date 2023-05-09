package com.yash.service;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.yash.entity.Contact;


@Service
public class ContactServiceImplement implements ContactService {
	List<Contact> list=List.of(
			new Contact(111L, "aa@gmail.com", "aaa", 1230L),
			new Contact(112L, "bb@gmail.com", "bbb", 1231L),
			new Contact(113L, "cc@gmail.com", "ccc", 1232L),
			new Contact(114L, "dd@gmail.com", "ddd", 1230L) 
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
