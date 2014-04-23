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
@Table(name="STATUSES")
public class Status {
	@Id
	@GeneratedValue
	private int id;
	private String venderCall;
	private String status;
	private String outcome;
	private Date lastUpdated;
	@ManyToOne
	@JoinColumn(name="id")
	private Requirements requirments;
	@OneToMany
	@JoinColumn(name="id")
	private List<Interview> interviews;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVenderCall() {
		return venderCall;
	}
	public void setVenderCall(String venderCall) {
		this.venderCall = venderCall;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Requirements getRequirments() {
		return requirments;
	}
	public void setRequirments(Requirements requirments) {
		this.requirments = requirments;
	}
	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
}
