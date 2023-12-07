package com.mhn.ticket.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhn.ticket.entity.PassengerInfo;
import com.mhn.ticket.entity.PaymentInfo;
import com.mhn.ticket.model.TicketBookingRequest;
import com.mhn.ticket.model.TicketStatusResponse;
import com.mhn.ticket.repository.PassengerInfoRepo;
import com.mhn.ticket.repository.PaymentInfoRepo;
import com.mhn.ticket.utility.PaymentUtils;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {
	@Autowired
	private PassengerInfoRepo passengerInfoRepo;
	@Autowired
	private PaymentInfoRepo paymentInfoRepo;

	@Override
	@Transactional
	public TicketStatusResponse bookTicket(TicketBookingRequest bookingRequest) {

		PassengerInfo passengerInfo = bookingRequest.getPassengerInfo();
		passengerInfo = passengerInfoRepo.save(passengerInfo);

		PaymentInfo paymentInfo = bookingRequest.getPaymentInfo();

		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

		paymentInfo.setPassengerId(passengerInfo.getpId());

		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepo.save(paymentInfo);

		TicketStatusResponse response = new TicketStatusResponse();
		response.setStaus("Sucess");
		response.setInfo(passengerInfo);
		response.setPnrNo(UUID.randomUUID().toString());
		response.setTotalFare(passengerInfo.getFare());
		return response;
	}

}
