package com.cts.steem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cts.steem.bean.User;
import com.cts.steem.service.UserService;

@RestController
@RequestMapping("/rest/profile")
public class ProfileRestController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/showProfile")
	public User showProfile(int userId) {

		User user1 = userService.getUserGamesAndFriends(userId);
		
		return user1;

	}
	
	

}
