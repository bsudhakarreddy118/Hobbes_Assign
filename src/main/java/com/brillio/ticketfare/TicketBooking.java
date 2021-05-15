package com.brillio.ticketfare;

public class TicketBooking {
private String id;
private int numberOfPersons;
private Double fare;
public double fareGenerator() {
	double totalFare = numberOfPersons*fare;
	System.out.println("The total cost for "+numberOfPersons+" Persons is Rs. "+totalFare);
	return totalFare;
}

public TicketBooking() {
	
}

public TicketBooking(String id, int numberOfPersons, Double fare) {
	super();
	this.id = id;
	this.numberOfPersons = numberOfPersons;
	this.fare = fare;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getNumberOfPersons() {
	return numberOfPersons;
}

public void setNumberOfPersons(int numberOfPersons) {
	this.numberOfPersons = numberOfPersons;
}

public Double getFare() {
	return fare;
}

public void setFare(Double fare) {
	this.fare = fare;
}


}
