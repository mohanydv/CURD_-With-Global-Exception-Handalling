package com.mhn.ticket.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity      
public class PassengerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String destination;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date travelDate;
	private String departureTime;
	private String arrivalTime;
	private Double fare;

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	
	public PassengerInfo(Long pId, String name, String email, String source, String destination, Date travelDate,
			String departureTime, String arrivalTime, Double fare) {
		super();
		this.pId = pId;
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PassengerInfo [pId=" + pId + ", name=" + name + ", email=" + email + ", source=" + source
				+ ", destination=" + destination + ", travelDate=" + travelDate + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}

}
