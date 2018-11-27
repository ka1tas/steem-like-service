package com.cts.steem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.steem.bean.Post;
import com.cts.steem.repository.PostRepository;
import com.cts.steem.rest.PostRestController;

@Service
public class PostService {

	private PostRepository postRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);
	

	@Autowired
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	
	@Transactional
	public List<Post> getPostDetails() {
		return postRepository.fetchAllPostDetails();
	}
	@Transactional
	public Post getPostDetailById(int postId) {
		return postRepository.fetchPostDetailById(postId);
	}

	@Transactional
	public Post getPostById(int postId) {
		return postRepository.findById(postId);
	}
	
	@Transactional
	public void savePost(Post post) {
		LOGGER.info("starting" );
		postRepository.save(post);
		LOGGER.debug("post details are" + post);
		LOGGER.info("end" );
	}
	

	
}
