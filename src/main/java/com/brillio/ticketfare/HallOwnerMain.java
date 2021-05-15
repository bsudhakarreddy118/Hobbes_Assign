package com.brillio.ticketfare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HallOwnerMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\user01\\eclipse-workspace\\TicketBookingApplication\\src\\main\\resources\\applicationContext4.xml");

		Hall hall = (Hall) context.getBean("hall");
		hall.display();

	}

}
