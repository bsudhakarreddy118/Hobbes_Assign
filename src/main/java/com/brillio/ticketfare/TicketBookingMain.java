package com.brillio.ticketfare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TicketBookingMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\user01\\eclipse-workspace\\TicketBookingApplication\\src\\main\\resources\\applicationContext1.xml");

		TicketBooking ticketBooking = (TicketBooking) context.getBean("ticketBooking");
		ticketBooking.fareGenerator();

	}
}
