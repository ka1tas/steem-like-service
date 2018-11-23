package com.cts.steem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	List<Post> fetchAllPostDetails();

	 Post fetchPostDetailById(@Param("postId") int postId);

}
