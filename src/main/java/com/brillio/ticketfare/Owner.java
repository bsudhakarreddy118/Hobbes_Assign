package com.brillio.ticketfare;

public class Owner {
private String name;
private String password;


public void display() {
	System.out.print(name);
}
public Owner() {
	
}
public Owner(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
