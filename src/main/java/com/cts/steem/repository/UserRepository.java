package com.cts.steem.repository;




import com.cts.steem.bean.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> fetchAllUserDetails();
	User fetchUserById (@Param("userId") int userId);
	User findById( int userId);
	User findByUserName(String userName);
	
}
