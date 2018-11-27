package com.cts.steem.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserName(String userName);
	User findById( int userId);
	User fetchUserGames(@Param("userId")int userId);
	User fetchUserFriends(@Param("userId")int userId);
	List<User> fetchAllUserDetails();
	User fetchUserById (@Param("userId") int userId);
	

	
}
