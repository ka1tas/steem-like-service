package com.cts.steem.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.SteemException;
import com.cts.steem.bean.Post;
import com.cts.steem.service.PostService;

@RestController
@RequestMapping("/rest/post")
public class PostRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);

	private PostService postService;

	@Autowired
	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	@GetMapping("/postlist")
	public List<Post> getAllPosts() throws SteemException {
		List<Post> allPosts = postService.getPostDetails();
		LOGGER.debug(allPosts.toString());
		return allPosts;
	}

}
