package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Branches {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Branchname;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	Encounter encounter;
//	
	
	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchname() {
		return Branchname;
	}
	public void setBranchname(String branchname) {
		Branchname = branchname;
	}
	
	@Override
	public String toString() {
		return "Branches [id=" + id + ", Branchname=" + Branchname + ", address=" + address + "]";
	}
	
	
	
	
}
