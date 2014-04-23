package com.multivision.req.pojos;

import java.sql.Date;
import java.util.List;

public class Trainee extends User{
	private int id;
	private String name;
	private String email;
	private String phone;
	private String skype;
	private Marketer marketer;
	private Supervisor supervisor;
	private Date dateOnMarket;
	private List<Status> statuses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public Marketer getMarketer() {
		return marketer;
	}
	public void setMarketer(Marketer marketer) {
		this.marketer = marketer;
	}
	public Supervisor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	public Date getDateOnMarket() {
		return dateOnMarket;
	}
	public void setDateOnMarket(Date dateOnMarket) {
		this.dateOnMarket = dateOnMarket;
	}
	public List<Status> getStatuses() {
		return statuses;
	}
	public void setStatuses(List<Status> statuses) {
		this.statuses = statuses;
	}
	
}
