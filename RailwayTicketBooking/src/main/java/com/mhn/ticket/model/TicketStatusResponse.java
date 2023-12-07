package com.mhn.ticket.model;

import com.mhn.ticket.entity.PassengerInfo;

public class TicketStatusResponse {

	private String staus;
	private String pnrNo;
	private  Double totalFare;
	private PassengerInfo info;
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public Double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	public PassengerInfo getInfo() {
		return info;
	}
	public void setInfo(PassengerInfo info) {
		this.info = info;
	}
	public TicketStatusResponse(String staus, String pnrNo, Double totalFare, PassengerInfo info) {
		super();
		this.staus = staus;
		this.pnrNo = pnrNo;
		this.totalFare = totalFare;
		this.info = info;
	}
	public TicketStatusResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TicketStatusResponse [staus=" + staus + ", pnrNo=" + pnrNo + ", totalFare=" + totalFare + ", info="
				+ info + "]";
	}
	
	
}
