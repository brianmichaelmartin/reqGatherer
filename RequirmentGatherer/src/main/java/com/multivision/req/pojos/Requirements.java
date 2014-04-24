package com.multivision.req.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="REQUIREMENTS")
public class Requirements {
	@Id
	@GeneratedValue
	private int id;
	private String city;
	private String state;
	private String client;
	private String description;
	private String vender;
	private String duration;
	private int experience; //in years
	@OneToMany
	@JoinColumn(name="id")
	private List<Status> status;
	@OneToMany
	@JoinColumn(name="id")
	private List<Status> techSkills;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<Status> getStatus() {
		return status;
	}
	public void setStatus(List<Status> status) {
		this.status = status;
	}
	public List<Status> getTechSkills() {
		return techSkills;
	}
	public void setTechSkills(List<Status> techSkills) {
		this.techSkills = techSkills;
	}
}
