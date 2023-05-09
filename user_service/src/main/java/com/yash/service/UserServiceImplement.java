package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.entity.User;

@Service
public class UserServiceImplement implements UserService{

	List<User> list=List.of(
			new User(1230L, "Shubhangi", "8767689765"),
			new User(1231L, "Asmita", "9012345678"),
			new User(1232L, "Prathmesh", "7800975677"),
			new User(1233L, "Abhay", "9800675544")
			);
	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}

}
