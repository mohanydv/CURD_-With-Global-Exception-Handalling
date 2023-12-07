package com.mhn.ticket.service;

import com.mhn.ticket.model.TicketBookingRequest;
import com.mhn.ticket.model.TicketStatusResponse;

public interface TicketBookingService {

	public  TicketStatusResponse bookTicket(TicketBookingRequest bokkingRequest);
	
}
