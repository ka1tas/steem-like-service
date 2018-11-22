package com.cts.steem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.steem.bean.User;
import com.cts.steem.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Transactional
	public List<User> getUserDetails() {
		return userRepository.fetchAllUserDetails();
	}
}
