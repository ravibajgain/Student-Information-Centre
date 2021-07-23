package com.webapp.student.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "renting")
public class Rent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "state")
	private String state;

	@Column(name = "price")
	@NotNull(message = "please enter the price")
	@Min(value = 50, message = "must be valid Price")
	private int price;

	@NotNull(message = "please enter the price")
	@Min(value = 1, message = "must be valid ")
	@Column(name = "bedroom")
	private int bedroom;

	@Column(name = "parking")
	private String parking;

	@Column(name = "suburb")
	@NotNull(message="Suburb required field")
	private String suburb;

	@Column(name = "email")
	@NotNull(message="Suburb required field")
	private String email;

	@Column(name = "description")
	@NotNull(message="Suburb required field")
	private String description;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User userDetail;
	
	public Rent() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
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
	

	public User getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(User userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "Rent [id=" + id + ", state=" + state + ", price=" + price + ", bedroom=" + bedroom + ", parking="
				+ parking + ", suburb=" + suburb + ", email=" + email + ", description=" + description + ", userDetail="
				+ userDetail + "]";
	}

}
