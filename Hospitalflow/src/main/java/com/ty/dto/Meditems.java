package com.ty.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Meditems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Meditem_id")
	private int id;
	private int Quntity;
	private int Price;
	private int Total;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuntity() {
		return Quntity;
	}
	public void setQuntity(int quntity) {
		Quntity = quntity;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "Meditems [id=" + id + ", Quntity=" + Quntity + ", Price=" + Price + ", Total=" + Total + "]";
	}
	
	

}
