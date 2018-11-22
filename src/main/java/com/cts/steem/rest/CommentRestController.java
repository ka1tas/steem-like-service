package com.cts.steem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.SteemException;
import com.cts.steem.bean.Comment;
import com.cts.steem.service.CommentService;

@RestController
@RequestMapping("/rest/comment")
public class CommentRestController {

	private CommentService commentService;

	@Autowired
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	@GetMapping("/commentlist")
	public List<Comment> getAllComments() throws SteemException {
		
		return commentService.getCommentDetails();
	}

}
