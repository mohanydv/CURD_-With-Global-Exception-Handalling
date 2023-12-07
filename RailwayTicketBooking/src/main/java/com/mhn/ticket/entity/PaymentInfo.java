package com.mhn.ticket.entity;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PaymentInfo {

	@Id
	private String paymentId = UUID.randomUUID().toString();
	private String accountNo;
	private Double amount;
	private String cardType;
	private Long passengerId;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public PaymentInfo(String accountNo, String cardType) {
		super();
		this.accountNo = accountNo;
		this.cardType = cardType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long long1) {
		this.passengerId = long1;
	}

	public PaymentInfo(String paymentId, String accountNo, Double amount, String cardType, Long passengerId) {
		super();
		this.paymentId = paymentId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerId = passengerId;
	}

	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PaymentInfo [paymentId=" + paymentId + ", accountNo=" + accountNo + ", amount=" + amount + ", cardType="
				+ cardType + ", passengerId=" + passengerId + "]";
	}

}
