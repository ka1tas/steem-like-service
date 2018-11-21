package com.cts.steem.bean;

public class Comment {
	
	private int id;
	private String content;
	private User user;
	private Post post;
	
	public Comment(int id, String content, User user, Post post) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
		this.post = post;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", user=" + user + ", post=" + post + "]";
	}
	
	
	

}
