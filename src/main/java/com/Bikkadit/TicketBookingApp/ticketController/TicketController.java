package com.Bikkadit.TicketBookingApp.ticketController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bikkadit.TicketBookingApp.requestBindingClass.Passanger;
import com.Bikkadit.TicketBookingApp.responseBindingClass.Ticket;
import com.Bikkadit.TicketBookingApp.ticketService.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	
	@PostMapping(value="/bookTicket",consumes= {"application/xml","application/json"},
			produces= {"application/xml","application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger pass){
	
		Ticket bookTicket = ticketService.bookTicket(pass);
		
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.OK);
		
		
	}

}
