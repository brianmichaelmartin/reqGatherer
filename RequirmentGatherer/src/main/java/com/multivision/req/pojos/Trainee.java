package com.multivision.req.pojos;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEES")
public class Trainee extends User{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String phone;
	private String skype;
	@ManyToOne
	@JoinColumn(name="id")
	private Marketer marketer;
	@ManyToOne
	@JoinColumn(name="id")
	private Supervisor supervisor;
	private Date dateOnMarket;
	@OneToMany
	@JoinColumn(name="id")
	private List<Status> status;
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
	public List<Status> getStatus() {
		return status;
	}
	public void setStatus(List<Status> status) {
		this.status = status;
	}
}
