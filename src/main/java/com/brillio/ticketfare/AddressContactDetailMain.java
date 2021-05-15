package com.brillio.ticketfare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AddressContactDetailMain {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	ApplicationContext context = new FileSystemXmlApplicationContext(
			"C:\\Users\\user01\\eclipse-workspace\\TicketBookingApplication\\src\\main\\resources\\applicationContext3.xml");

	ContactDetail contactDetail = (ContactDetail) context.getBean("contact");
	contactDetail.display();
}
}
