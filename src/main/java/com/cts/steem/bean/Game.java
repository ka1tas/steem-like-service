package com.cts.steem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="game")

@NamedQueries({
	@NamedQuery(
			name="Game.fetchAllGameDetails",
			query="select distinct g from Game g "
			),
	@NamedQuery(
			name="Game.fetchGameDetails",
			query="select distinct g from Game g "
					+ "where g.id = :gameId"
			)
})

public class Game {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ga_id")
	private int id;
	@Column(name = "ga_name")
	private String name;
	@Column(name = "ga_developer")
	private String developer;
	@Column(name = "ga_description")
	private String description;
	@Column(name = "ga_about")
	private String about;
	@Column(name = "ga_price")
	private int price;
	@Column(name = "ga_rating")
	private int rating;
	@Column(name = "ga_genre")
	private String genre;
	@Column(name = "ga_year")
	private int year;

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
