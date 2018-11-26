package com.cts.steem.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user")
@NamedQueries({
	@NamedQuery(
        name="User.fetchUserGames",
        query="select distinct u from User u " + 
        		"left join fetch u.gameList " + 
        		"where u.id = :userId"
 	),
	@NamedQuery(
	        name="User.fetchUserFriends",
	        query="select distinct u from User u " + 
	        		"left join fetch u.friendList " + 
	        		"where u.id = :userId"
	 	),
	/*@NamedQuery(
	        name="User.fetchUserFriends",
	        query="select distinct u from User u " + 
	        		"left join fetch u.game " + 
	        		"where u.id = :userId"
 	)*/
	
	
	@NamedQuery(name = "User.fetchAllUserDetails", query = "select distinct u from User u"), 

	@NamedQuery(name = "User.fetchUserById", query =" select DISTINCT u from User u" +  " where u.id=:userId")
	
})
public class User {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int id;
	
	@Column(name="us_firstname")
	private String firstName;
	
	@Column(name="us_lastname")
	private String lastName;
	
	@Column(name="us_gender")
	private String gender; 
	
	@Column(name="us_age")
	private int age;
	
	@Column(name="us_country")
	private String country;
	
	@Column(name="us_email")
	private String email;
	
	@Column(name="us_mobilenumber")
	private String mobileno;
	
	@Column(name="us_description")
	private String description;
	
	@Column(name="us_steempoints")
	private int steempoints; 
	
	@Column(name="us_username")
	private String userName;
	
	@Column(name="us_password")
	private String password;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		name="gameusers",
		joinColumns={
			@JoinColumn(name="gu_us_id")
		},
		inverseJoinColumns={
			@JoinColumn(name="gu_ga_id")
		}
	)

	private List<Game> gameList;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		name="friend",
		joinColumns={
			@JoinColumn(name="fr_us_id")
		},
		inverseJoinColumns={
			@JoinColumn(name="fr_fr_id")
		}
	)
	@JsonIgnore
	private List<User> friendList;
	
	@Transient
	private List<String> friends;
	
	

	public User(int id, String firstName, String lastName, String gender, int age, String country, String email,
			String mobileno, String description, int steempoints, String userName, String password, List<Game> gameList,
			List<User> friendList, List<String> friends) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.email = email;
		this.mobileno = mobileno;
		this.description = description;
		this.steempoints = steempoints;
		this.userName = userName;
		this.password = password;
		this.gameList = gameList;
		this.friendList = friendList;
		this.friends = friends;
	}


	
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}







	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	


	public List<Game> getGameList() {
		return gameList;
	}



	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}


	public List<User> getFriendList() {
		return friendList;
	}


	public void setFriendList(List<User> friendList) {
		this.friendList = friendList;
	}



	public List<String> getFriends() {

		List<String> friends = new ArrayList<String>();
		for (User friend : friendList) {
			friends.add(friend.getUserName());
		}
		return friends;
		
	}



	public void setFriends(List<String> friends) {
		this.friends = friends;
	}



	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}








	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getSteempoints() {
		return steempoints;
	}


	public void setSteempoints(int steempoints) {
		this.steempoints = steempoints;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}







	public String getMobileno() {
		return mobileno;
	}







	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}







	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", country=" + country + ", email=" + email + ", mobileno=" + mobileno
				+ ", description=" + description + ", steempoints=" + steempoints + ", userName=" + userName
				+ ", password=" + password + ", gameList=" + gameList + ", friendList=" + friendList + ", friends="
				+ friends + "]";
	}



	


}
