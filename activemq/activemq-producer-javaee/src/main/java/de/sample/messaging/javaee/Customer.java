package de.sample.messaging.javaee;

import java.time.LocalDate;

public class Customer {

	private Long id;
	private String firstsname;
	private String lastname;
	private LocalDate birthdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstsname;
	}

	public void setFirstname(String firstsname) {
		this.firstsname = firstsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
