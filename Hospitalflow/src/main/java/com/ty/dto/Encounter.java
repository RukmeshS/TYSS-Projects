package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admission_id")
	private int id;
	private String reason;
	
	
	  @OneToMany//(cascade = CascadeType.ALL)//(mappedBy = "encounter")// 
	  //@Column(unique = true)
	  List<Branches> branches;
	 
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Medorder> medorder;
	
	
	public List<Medorder> getMedorder() {
		return medorder;
	}
	public void setMedorder(List<Medorder> medorder) {
		this.medorder = medorder;
	}
	
	
	  public List<Branches> getBranches() { return branches; } public void
	  setBranches(List<Branches> branches) { this.branches = branches;
	 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Encounter [id=" + id + ", reason=" + reason + ", branches=" + branches + ", medorder=" + medorder + "]";
	}
	
	
	
}
	
	

