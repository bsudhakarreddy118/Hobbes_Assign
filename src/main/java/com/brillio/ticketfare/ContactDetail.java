package com.brillio.ticketfare;

import org.springframework.beans.factory.annotation.Autowired;

public class ContactDetail {
	private String mobileNumber;
	private String alternateMobileNumber;
	private String landLineNumber;
	private String email;
	@Autowired
	Address address;
	void display() {
		System.out.println("Mobile: "+mobileNumber+"\nAlternate Mobile: "+alternateMobileNumber+
				"\nLandline :"+landLineNumber+"\nemail :"+email);
	address.display();
	}
	
	public ContactDetail() {
		
	}

	public ContactDetail( String mobileNumber, String alternateMobileNumber, String landLineNumber,
			String email) {
		super();
		
		this.mobileNumber = mobileNumber;
		this.alternateMobileNumber = alternateMobileNumber;
		this.landLineNumber = landLineNumber;
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
