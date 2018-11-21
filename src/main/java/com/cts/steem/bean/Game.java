package com.cts.steem.bean;


public class Game {
	private int id;
	private String name;
	private String developer;
	private String description;
	private String about;
	private int price;
	private int rating;
	private String genre;
	private int year;
	
	
	public Game(int id, String name, String developer, String description, String about, int price, int rating,
			String genre, int year) {
		super();
		this.id = id;
		this.name = name;
		this.developer = developer;
		this.description = description;
		this.about = about;
		this.price = price;
		this.rating = rating;
		this.genre = genre;
		this.year = year;
	}


	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", developer=" + developer + ", description=" + description
				+ ", about=" + about + ", price=" + price + ", rating=" + rating + ", genre=" + genre + ", year=" + year
				+ "]";
	}
	
	
	
	
}
