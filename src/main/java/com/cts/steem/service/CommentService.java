package com.cts.steem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cts.steem.bean.Comment;
import com.cts.steem.repository.CommentRepository;
import com.cts.steem.repository.PostRepository;
import com.cts.steem.repository.UserRepository;



@Service
public class CommentService {
	private CommentRepository commentRepository;
	@SuppressWarnings("unused")
	private PostRepository postRepository;
	@SuppressWarnings("unused")
	private UserRepository userRepository;
	
	@Autowired
	public void setCommentRepository(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	
	@Autowired
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Transactional
	public List<Comment> getCommentDetails() {
		return commentRepository.fetchAllCommentDetails();
	}

}
