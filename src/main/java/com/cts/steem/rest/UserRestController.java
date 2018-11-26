package com.cts.steem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.SteemException;
import com.cts.steem.bean.User;
import com.cts.steem.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserRestController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/list")
	public List<User> getAllUsers() throws SteemException {
		return userService.getUserDetails();
	}

}
