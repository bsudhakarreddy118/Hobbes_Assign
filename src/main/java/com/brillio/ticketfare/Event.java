package com.brillio.ticketfare;

public class Event {
private String id;
private String eventName;
private String eventOrganiser;
private Double fare;

public void display() {
	System.out.println("Event: "+eventName+"\nOrganized By "+eventOrganiser+"\nFare "+fare);
}
public Event() {
	
}
public Event(String eventName, String eventOrganiser, Double fare) {
	super();
	this.eventName = eventName;
	this.eventOrganiser = eventOrganiser;
	this.fare = fare;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public String getEventOrganiser() {
	return eventOrganiser;
}
public void setEventOrganiser(String eventOrganiser) {
	this.eventOrganiser = eventOrganiser;
}
public Double getFare() {
	return fare;
}
public void setFare(Double fare) {
	this.fare = fare;
}

}
