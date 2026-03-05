package com.example.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	private String email;
	private String phone;
	
	public Long getId() {
		return id;
	} public void setId(Long id) {
		this.id=id;
	} public String getname() {
		return name;
	} public void setname(String name) {
		this.name=name;
	} public String getemail() {
		return email;
	} public void setemail(String email) {
		this.email=email;
	} public String getphone() {
		return phone;
	} public void setphone(String phone) {
		this.phone=phone;
	}
}