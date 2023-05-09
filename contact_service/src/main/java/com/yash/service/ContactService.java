package com.yash.service;

import java.util.List;

import com.yash.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}
