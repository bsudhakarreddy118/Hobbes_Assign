package com.brillio.ticketfare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EventMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context1 = new FileSystemXmlApplicationContext(
				"C:\\Users\\user01\\eclipse-workspace\\TicketBookingApplication\\src\\main\\resources\\applicationContext2.xml");
		Event event1 = (Event) context1.getBean("event1");
		event1.display();
		Event event2 = (Event) context1.getBean("event2");
		event2.display();
		Event event3 = (Event) context1.getBean("event3");
		event3.display();
	}

}
