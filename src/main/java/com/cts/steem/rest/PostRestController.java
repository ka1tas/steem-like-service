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
import com.cts.steem.bean.Post;
import com.cts.steem.bean.User;
import com.cts.steem.service.PostService;
import com.cts.steem.service.UserService;

@RestController
@RequestMapping("/rest/post")
public class PostRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);

	private PostService postService;
	private UserService userService;

	@Autowired
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/postlist")
	public List<Post> getAllPosts() throws SteemException {
		List<Post> allPosts = postService.getPostDetails();
		LOGGER.debug(allPosts.toString());
		return allPosts;
	}
	
	@GetMapping("/show/{postId}")
	public Post getPostById(@PathVariable int postId) throws SteemException {
		Post allPosts = postService.getPostDetailById(postId);
		LOGGER.debug(allPosts.toString());
		return allPosts;
	}

	
	@PostMapping("/addpost")
	public ResponseEntity<Post> insertPost(@RequestBody Post post) {
		int userid=post.getUser().getId();
		LOGGER.info("user Id :" +userid);	
		LOGGER.debug("User Service: {}", userService);
		User user = userService.getUser(userid);
		LOGGER.debug(user.toString());
		post.setUser(user);

		LOGGER.info("starting" );
		postService.savePost(post);
		LOGGER.debug("post details are" + post);
		LOGGER.info("end" );
		return new ResponseEntity<Post>(post, HttpStatus.OK);
		
	}

	
	
}
