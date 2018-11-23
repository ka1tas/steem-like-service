package com.cts.steem.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.SteemException;
import com.cts.steem.bean.Comment;
import com.cts.steem.bean.User;
import com.cts.steem.repository.CommentRepository;
import com.cts.steem.repository.PostRepository;
import com.cts.steem.repository.UserRepository;
import com.cts.steem.service.CommentService;
import com.cts.steem.service.UserService;

@RestController
@RequestMapping("/rest/comment")
public class CommentRestController {

	private CommentService commentService;
	@SuppressWarnings("unused")
	private UserService userservice;
	@SuppressWarnings("unused")
	private CommentRepository commentRepository;
	@SuppressWarnings("unused")
	private UserRepository userRepository;
	private PostRepository postRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentRestController.class);

	@Autowired
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	@GetMapping("/commentlist")
	public List<Comment> getAllComments() throws SteemException {
		
		return commentService.getCommentDetails();
	}
	@GetMapping("/show/{postId}")
	public Comment getCommentById(@PathVariable int postId) throws SteemException {
		Comment commentById = commentService.getCommentDetailById(postId);
		LOGGER.debug(commentById.toString());
		return commentById;
	}
	@PostMapping("/addcomment")
	public ResponseEntity<Comment> insertComment(@RequestBody Comment comment) {
		System.out.println(comment);
		int userid=comment.getUser().getId();
		System.out.println(userid);
		User user = userRepository.fetchUserById(userid);
		comment.setUser(user);
		int postid=comment.getPost().getId();
		comment.setPost(postRepository.fetchPostDetailById(postid));
		LOGGER.info("starting" );
		commentService.saveComment(comment);
		LOGGER.debug("comment details are" + comment);
		LOGGER.info("end" );
		return new ResponseEntity<Comment>(comment, HttpStatus.OK);
		
	}
}
