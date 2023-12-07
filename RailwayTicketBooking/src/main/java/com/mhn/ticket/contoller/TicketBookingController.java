package com.mhn.ticket.contoller;

import org.hibernate.usertype.LoggableUserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhn.ticket.model.TicketBookingRequest;
import com.mhn.ticket.model.TicketStatusResponse;
import com.mhn.ticket.service.TicketBookingService;

@RestController
@RequestMapping("/railway")
public class TicketBookingController {
	
	Logger log= LoggerFactory.getLogger(TicketBookingController.class);
	@Autowired
	
	private TicketBookingService bookingService;

	@PostMapping("/ticket")
	public TicketStatusResponse bookticket(@RequestBody TicketBookingRequest bookingRequest) {
		log.info(bookingRequest.toString());
		return bookingService.bookTicket(bookingRequest);

	}
}
