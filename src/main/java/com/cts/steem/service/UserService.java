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
	public User getUser(String userName) {
		return (User) userRepository.findByUserName(userName);

	}
	
	@Transactional
	public User getUserGamesAndFriends(int userId) {
		User user = new User();
		user=userRepository.fetchUserGames(userId);
		user=userRepository.fetchUserFriends(userId);
		return user;
	}

	public List<User> getUserDetails() {
		return userRepository.fetchAllUserDetails();
	}
	
	@Transactional
	public User getUserById(int userId) {
		return userRepository.fetchUserById(userId);
	}
	
	@Transactional
	public User getUser(int userId) {
		return userRepository.findById(userId);
	}
}

