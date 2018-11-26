package com.cts.steem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.Comment;
import com.cts.steem.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> fetchAllUserDetails();
	User fetchUserById (@Param("userId") int userId);
	
	User findById( int userId);
	
}
