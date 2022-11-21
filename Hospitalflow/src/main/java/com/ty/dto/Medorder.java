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
public class Medorder {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Medorder_id")
	private int id;
	private String Prec_name;
	private int Nummbers;
	private int Duration;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Meditems> meditems;
	
	
	public List<Meditems> getMeditems() {
		return meditems;
	}
	public void setMeditems(List<Meditems> meditems) {
		this.meditems = meditems;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrec_name() {
		return Prec_name;
	}
	public void setPrec_name(String prec_name) {
		Prec_name = prec_name;
	}
	public int getNummbers() {
		return Nummbers;
	}
	public void setNummbers(int nummbers) {
		Nummbers = nummbers;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Medorder [id=" + id + ", Prec_name=" + Prec_name + ", Nummbers=" + Nummbers + ", Duration=" + Duration
				+ ", meditems=" + meditems + "]";
	}
	
	
}
