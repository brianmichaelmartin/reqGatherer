package com.multivision.req.pojos;

import java.util.List;

public class Supervisor extends User {
	private long super_id;
	private String name, email, phone;
	private List<Trainee> trainees;
	public long getSuper_id() {
		return super_id;
	}
	public void setSuper_id(long super_id) {
		this.super_id = super_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}
}