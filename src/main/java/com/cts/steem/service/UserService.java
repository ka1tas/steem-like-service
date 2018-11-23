package com.cts.steem.service;

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
	public User getUser(String userName) {

		return userRepository.findByUserName(userName);

	}
	
	@Transactional
	public User getUser(int userId) {
		return userRepository.findById(userId);
	}


}