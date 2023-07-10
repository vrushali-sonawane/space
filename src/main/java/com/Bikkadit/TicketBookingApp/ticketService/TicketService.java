package com.Bikkadit.TicketBookingApp.ticketService;

import com.Bikkadit.TicketBookingApp.requestBindingClass.Passanger;
import com.Bikkadit.TicketBookingApp.responseBindingClass.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passanger pass);

}
