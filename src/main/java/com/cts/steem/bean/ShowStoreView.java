package com.cts.steem.bean;

import java.util.List;



public class ShowStoreView {
	
	private User user;
	private List<Game> game;
	
	
	public ShowStoreView(User user, List<Game> game) {
		super();
		this.user = user;
		this.game = game;
	}


	public ShowStoreView() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Game> getGame() {
		return game;
	}


	public void setGame(List<Game> game) {
		this.game = game;
	}


	@Override
	public String toString() {
		return "ShowStoreView [user=" + user + ", game=" + game + "]";
	}
	
	
	
	

}
