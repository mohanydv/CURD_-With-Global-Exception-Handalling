package com.mhn.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RailwayTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayTicketBookingApplication.class, args);
	}

}
