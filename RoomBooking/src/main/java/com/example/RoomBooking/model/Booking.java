package com.example.RoomBooking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private String conditioner;
	private Date checkin;
	private Date checkout;

	
	public Booking() {	
	}
	
	public Booking(int id, String type, String conditioner, Date checkin, Date checkout) {
		super();
		this.id = id;
		this.type = type;
		this.conditioner = conditioner;
		this.checkin = checkin;
		this.checkout = checkout;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConditioner() {
		return conditioner;
	}

	public void setConditioner(String conditioner) {
		this.conditioner = conditioner;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	

}
