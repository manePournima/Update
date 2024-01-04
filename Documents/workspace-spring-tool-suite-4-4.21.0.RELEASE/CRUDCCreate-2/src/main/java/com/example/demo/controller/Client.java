package com.example.demo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_db")
public class Client {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String Name;
	@Column
	private String Phoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", Name=" + Name + ", Phoneno=" + Phoneno + "]";
	}
	
	
	

}
