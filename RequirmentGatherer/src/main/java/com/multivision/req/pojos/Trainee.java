package com.multivision.req.pojos;

import java.util.Date;
import java.util.List;

public class Trainee extends User{
	private long trainee_id;
	private String name, email, phone, skype;
	private Marketer marketer;
	private Supervisor supervisor;
	private Date dateOnMarket;
	private List<Status> statuses;
}
