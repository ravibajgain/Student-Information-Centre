package com.webapp.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "services")
public class Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "email_id")
	@NotNull(message = "required")
	private String email;

	@Column(name = "service_type")
	@NotNull(message = "Required field")
	private String serviceType;

	@Column(name = "contact_no")
	@NotNull(message = "Required field")
	@Digits(integer = 10, fraction = 0)
	private int mobile;

	@Column(name = "Name")
	@NotNull(message = "Required field")
	private String name;

	@Column(name = "Description")
	@NotNull(message = "Required field")
	private String description;

	public Info() {

	}
	

	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", email=" + email + ", serviceType=" + serviceType + ", mobile=" + mobile + ", name="
				+ name + ", description=" + description + "]";
	}

}
