package com.multivision.req.pojos;

import java.util.List;

public class Marketer extends User {
	private long marketer_id;
	private String name, email, phone;
	private List<Trainee> trainees;
	public long getMarketer_id() {
		return marketer_id;
	}
	public void setMarketer_id(long marketer_id) {
		this.marketer_id = marketer_id;
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
