package com.mhn.ticket.model;

import com.mhn.ticket.entity.PassengerInfo;
import com.mhn.ticket.entity.PaymentInfo;

public class TicketBookingRequest {

	  PassengerInfo passengerInfo;
	 PaymentInfo paymentInfo;
	
	
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	@Override
	public String toString() {
		return "TicketBookingRequest [passengerInfo=" + passengerInfo + ", paymentInfo=" + paymentInfo + "]";
	}
	public TicketBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}
	public TicketBookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	
}
