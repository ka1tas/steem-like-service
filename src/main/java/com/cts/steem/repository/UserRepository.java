package com.cts.steem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cts.steem.bean.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserName(String userName);
	User findById( int userId);
}
