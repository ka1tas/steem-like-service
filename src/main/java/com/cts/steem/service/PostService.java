package com.cts.steem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.steem.bean.Post;
import com.cts.steem.repository.PostRepository;
import com.cts.steem.repository.UserRepository;

@Service
public class PostService {

	private PostRepository postRepository;
	@SuppressWarnings("unused")
	

	@Autowired
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	
	@Transactional
	public List<Post> getPostDetails() {
		return postRepository.fetchAllPostDetails();
	}

}
