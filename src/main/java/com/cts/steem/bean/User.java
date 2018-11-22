package com.cts.steem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = "User.fetchAllUserDetails", query = "select distinct u from User u") })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "us_id")
	private int id;

	@Column(name = "us_firstname")
	private String firstName;

	@Column(name = "us_lastname")
	private String lastName;

	@Column(name = "us_gender")
	private String gender;

	@Column(name = "us_age")
	private int age;

	@Column(name = "us_country")
	private String country;

	@Column(name = "us_email")
	private String email;

	@Column(name = "us_mobilenumber")
	private int mobileno;

	@Column(name = "us_description")
	private String description;

	@Column(name = "us_steempoints")
	private int steempoints;

	@Column(name = "us_username")
	private String userName;

	@Column(name = "us_password")
	private String password;

	public User(int id, String firstName, String lastName, String gender, int age, String country, String email,
			int mobileno, String description, int steempoints, String userName, String password) {
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
	}

	public User() {
		super();

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

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", country=" + country + ", email=" + email + ", mobileno=" + mobileno
				+ ", description=" + description + ", steempoints=" + steempoints + ", userName=" + userName
				+ ", password=" + password + "]";
	}

}
