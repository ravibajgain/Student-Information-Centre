package com.webapp.student.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "mobile_no")
	private int mobile_no;

	@OneToOne(mappedBy = "userDetail", cascade = CascadeType.ALL)
	private Lease lease;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "userDetail", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<Job> jobLists;

	@OneToMany(mappedBy = "userDetail", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Rent> rentLists;

	@OneToMany(mappedBy = "userDetail", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Sale> saleLists;

	@OneToMany(mappedBy = "userDetail", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Info> infoLists;

	public User() {

	}

	public List<Job> getJobLists() {
		return jobLists;
	}

	public void setJobLists(List<Job> jobLists) {
		this.jobLists = jobLists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMobile_no() {
		return mobile_no;
	}

	public Lease getLease() {
		return lease;
	}

	public void setLease(Lease lease) {
		this.lease = lease;
	}

	public List<Rent> getRentLists() {
		return rentLists;
	}

	public void setRentLists(List<Rent> rentLists) {
		this.rentLists = rentLists;
	}

	public List<Sale> getSaleLists() {
		return saleLists;
	}

	public void setSaleLists(List<Sale> saleLists) {
		this.saleLists = saleLists;
	}

	public List<Info> getInfoLists() {
		return infoLists;
	}

	public void setInfoLists(List<Info> infoLists) {
		this.infoLists = infoLists;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void addJobs(Job tempJobs) {
		if (jobLists == null) {
			jobLists = new ArrayList<>();
		}
		jobLists.add(tempJobs);
		tempJobs.setUserDetail(this);
	}

	public void addRents(Rent tempRents) {
		if (rentLists == null) {
			rentLists = new ArrayList<>();
		}
		rentLists.add(tempRents);
		tempRents.setUserDetail(this);
	}

	public void add(Sale tempSales) {
		if (saleLists == null) {
			saleLists = new ArrayList<>();
		}
		saleLists.add(tempSales);
		tempSales.setUserDetail(this);
	}

	public void add(Info tempInfos) {
		if (infoLists == null) {
			infoLists = new ArrayList<>();
		}
		infoLists.add(tempInfos);
		tempInfos.setUserDetail(this);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", address=" + address + ", mobile_no=" + mobile_no + ", lease=" + lease + ", jobLists=" + jobLists
				+ ", rentLists=" + rentLists + ", saleLists=" + saleLists + ", infoLists=" + infoLists + "]";
	}

}
