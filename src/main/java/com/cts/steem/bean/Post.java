package com.cts.steem.bean;

public class Post {

	private int id;
	private String content;
	private User user;
	
	
	public Post(int id, String content, User user) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
	}


	public Post() {
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


	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", user=" + user + "]";
	}
	
	
}
