package com.brillio.ticketfare;

import org.springframework.beans.factory.annotation.Autowired;

public class Hall {
@Autowired
Owner owner;
private int length;
private int width;

void display() {
	System.out.println(length+"      "+width+" Owned by ");
	owner.display();
}

public Owner getOwner() {
	
	return owner;
}

public void setOwner(Owner owner) {
	
	this.owner = owner;
}

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}


}
