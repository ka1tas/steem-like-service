package com.cts.steem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.steem.bean.Comment;
import com.cts.steem.repository.CommentRepository;
import com.cts.steem.repository.PostRepository;
import com.cts.steem.repository.UserRepository;
import com.cts.steem.rest.CommentRestController;



@Service
public class CommentService {
	private CommentRepository commentRepository;
	@SuppressWarnings("unused")
	private PostRepository postRepository;
	@SuppressWarnings("unused")
	private UserRepository userRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentRestController.class);
	
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
	
	@Transactional
	public Comment getCommentDetailById(int postId) {
		return commentRepository.fetchCommentDetailById(postId);
	}
	
	
	@Transactional
	public void saveComment(Comment comment) {
		LOGGER.info("starting" );
		commentRepository.save(comment);
		LOGGER.debug("traveller details are" + comment);
		LOGGER.info("end" );
	}

}
