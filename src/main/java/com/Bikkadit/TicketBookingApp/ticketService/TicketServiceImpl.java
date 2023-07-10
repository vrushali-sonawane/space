package com.Bikkadit.TicketBookingApp.ticketService;

import org.springframework.stereotype.Service;

import com.Bikkadit.TicketBookingApp.requestBindingClass.Passanger;
import com.Bikkadit.TicketBookingApp.responseBindingClass.Ticket;

@Service
public class TicketServiceImpl implements TicketService{

	@Override
	public Ticket bookTicket(Passanger pass) {
		if(pass!=null) {
			Ticket t=new Ticket();
			t.setPnr("3254");
			t.setTicketStatus("confirmed");
			t.setTicketPrice(3567.67);
			
			return t;
		}
		return null;
	}

}
